// https://school.programmers.co.kr/learn/courses/30/lessons/17679
import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] b = new char[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<board[i].length(); j++) {
                b[i][j] = board[i].charAt(j);
            }
        }
        
        // 주어진 board 배열을 한 번만 도는 것이 아니라 지워지는 블록이 없어질때까지 반복해야 하므로 while 반복문을 사용한다. 
        while (true) {
            List<int[]> list = new ArrayList<>();
            for (int i=0; i<m-1; i++) {
                for (int j=0; j<n-1; j++) {
                    if (b[i][j] == b[i][j+1] && b[i][j+1] == b[i+1][j+1]
                       && b[i+1][j+1] == b[i+1][j] && b[i][j] != '*') {
                        list.add(new int[]{i,j}); 
                        list.add(new int[]{i,j+1}); 
                        list.add(new int[]{i+1,j}); 
                        list.add(new int[]{i+1,j+1});                      
                    }
                }
            }
            // 모든 좌표 확인 후 더 이상 지워지는 블록이 없다면 반복문 종료
            if (list.size() == 0) {
               break;
            } else {
                int cnt = 0;
                for (int[] s : list) {
                    // 중복된 작업은 제거
                    if (b[s[0]][s[1]] != '*') {
                        b[s[0]][s[1]] = '*';
                        cnt++;
                    }
                }
                // 지워지는 블록의 좌표 수
                answer += cnt;
            }
    
             // 지워진 블록의 좌표가 *로 변경됨 -> 블록에 빈 공간이 생김. -> 위에 블록이 있으면 아래로 떨어져 빈 공간을 채워야 한다.
            while (true) {
                boolean isMoved = false;
                for (int i=0; i<m-1; i++) {
                    for (int j=0; j<n; j++) {
                        if (b[i][j] != '*' && b[i+1][j] == '*') {
                            b[i+1][j] = b[i][j];
                            b[i][j] = '*';
                            isMoved = true;
                        }
                    }
                }
                if (!isMoved)
                    break;
            }   
        }
        
        return answer;
    }
}
