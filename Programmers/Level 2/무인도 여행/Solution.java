// https://school.programmers.co.kr/learn/courses/30/lessons/154540
import java.util.*;
class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static boolean[][] visited;
    public int[] solution(String[] maps) {
        int[] answer = {};
        
        visited = new boolean[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<maps.length; i++) {
            for (int j=0; j<maps[i].length(); j++) {
                if (Character.isDigit(maps[i].charAt(j)) && !visited[i][j]) {
                    list.add(bfs(maps, i, j));
                }
            }
        }
        
        if (list.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[list.size()];
            Collections.sort(list);
            for (int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
    
    private static int bfs(String[] maps, int x, int y) {
        
        Queue<int[]> queue = new LinkedList<>();
        visited[x][y] = true;
        int cnt = Integer.parseInt(maps[x].substring(y, y+1));
        queue.add(new int[]{x,y});
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            for (int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length()) {
                    if (Character.isDigit(maps[nx].charAt(ny)) && !visited[nx][ny]) {
                        cnt += Integer.parseInt(maps[nx].substring(ny, ny+1));
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
  
        return cnt;
    }
    
}
