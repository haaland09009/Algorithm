// https://school.programmers.co.kr/learn/courses/30/lessons/81302
import java.util.*;
class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for (int i=0; i<places.length; i++) {
            answer[i] = bfs(places[i]);
        }
        return answer;
    }
    
    private static int bfs(String[] p) {
        
        List<int[]> start = new ArrayList<>();
        for (int i=0; i<p.length; i++) {
            for (int j=0; j<p[i].length(); j++) {
                if (p[i].charAt(j) == 'P')
                    start.add(new int[]{i, j});
            }
        }
        
        for (int i=0; i<start.size(); i++) {
            int[] location = start.get(i);
            int x = location[0];
            int y = location[1];
            
            boolean[][] visited = new boolean[p.length][p[0].length()];
            int[][] distance = new int[p.length][p[0].length()];
            
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{x, y});
            visited[x][y] = true;
            
            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int cx = cur[0];
                int cy = cur[1];
                for (int j=0; j<4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];
                    if (0 <= nx && nx < p.length && 0 <= ny && ny < p[0].length() && !visited[nx][ny]) {
                        if (p[nx].charAt(ny) == 'O') {
                            distance[nx][ny] = distance[cx][cy] + 1;
                            visited[nx][ny] = true;
                            queue.add(new int[]{nx, ny});
                        } else if (p[nx].charAt(ny) == 'P' && distance[cx][cy] <= 1) {
                            return 0;
                        }
                    }
                }
            }
 
        }
        
     return 1;   
    }
}
   
  
