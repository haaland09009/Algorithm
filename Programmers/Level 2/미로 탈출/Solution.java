// https://school.programmers.co.kr/learn/courses/30/lessons/159993
import java.util.*;
class Solution {
    public int solution(String[] maps) {
        int answer = 0;
        
        int path1 = bfs('S', 'L', maps);
        int path2 = bfs('L', 'E', maps); 
        
        if (path1 != -1 && path2 != -1) 
            return path1 + path2;
        return -1;
    }
    
    private static int bfs(char start, char end, String[] maps) {
        
        Queue<int[]> queue = new LinkedList<>();
        boolean flag = false;
        
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
            
        for (int i=0; i<maps.length; i++) {
            for (int j=0; j<maps[i].length(); j++) {
                if (maps[i].charAt(j) == start) {
                    queue.add(new int[]{i, j, 0});
                    visited[i][j] = true;
                    flag = true;
                    break;
                }
            }
            if (flag) 
                break;
        }
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            int cost = cur[2];
            if (maps[cx].charAt(cy) == end)
                return cost;
            for (int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length()) {
                    if (maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, cost + 1});
                    }
                }
            }
        }
        return -1; 
    }
    
    
}
