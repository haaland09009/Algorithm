// https://school.programmers.co.kr/learn/courses/30/lessons/77485
import java.util.*;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        
        int[][] arr = new int[rows][columns];
        int cnt = 0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                arr[i][j] = ++cnt;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<queries.length; i++) {
            int x1 = queries[i][0] - 1; int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1; int y2 = queries[i][3] - 1;
            
            int tmp = arr[x1][y1];
            int minValue = rows * columns;
            
            for (int j=x1; j<x2; j++) {
                arr[j][y1] = arr[j+1][y1];
                minValue = Math.min(minValue, arr[j][y1]);        
            }
            
            for (int j=y1; j<y2; j++) {
                arr[x2][j] = arr[x2][j+1];
                minValue = Math.min(minValue, arr[x2][j]);
            }
            
            for (int j=x2; j>x1; j--) {
                arr[j][y2] = arr[j-1][y2];
                minValue = Math.min(minValue, arr[j][y2]);
            }            
            
            
            for (int j=y2; j>y1; j--) {
                arr[x1][j] = arr[x1][j-1];
                minValue = Math.min(minValue, arr[x1][j]);
            }
            

            arr[x1][y1+1] = tmp;
            minValue = Math.min(minValue, arr[x1][y1+1]);
            
            list.add(minValue);
      
        }
        
        
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
