// https://school.programmers.co.kr/learn/courses/30/lessons/68645
import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int[][] arr = new int[n][n];
        
        int x = -1;
        int y = 0;
        
        int num = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                if (i % 3 == 0) {
                   x++; 
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                arr[x][y] = ++num;   
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i][j] == 0) {
                    break;
                } else {
                    list.add(arr[i][j]);
                }
            }
        }
        
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) 
            answer[i] = list.get(i);
        
        return answer;
    }
}
