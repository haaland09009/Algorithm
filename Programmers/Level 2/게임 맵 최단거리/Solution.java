// https://school.programmers.co.kr/learn/courses/30/lessons/1844
import java.util.*;
class Solution {
    int[] dx = {0,0,-1,1};
    int[] dy = {-1,1,0,0};
    int n, m;
    public int solution(int[][] maps) {
        int answer = 0;
        
        n = maps.length;
        m = maps[0].length;
        
        answer = bfs(0, 0, maps);
        
        return answer;
    }
    
    private int bfs(int x, int y, int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            if (cx == n-1 && cy == m-1) {
                return maps[n-1][m-1];
            }
            for (int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[cx][cy] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }
}
