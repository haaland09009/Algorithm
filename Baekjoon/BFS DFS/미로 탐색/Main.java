//https://www.acmicpc.net/problem/2178
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] arr; 
	static int[][] visited;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new int[n][m];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j=0; j<str.length(); j++) {
				arr[i][j] = Integer.parseInt(str.substring(j, j+1));
			}
		}
	
		
		System.out.println(bfs(0,0));
	
	}
	
	public static int bfs(int x, int y) {
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		visited[x][y] = 1;
		
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			for (int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (nx >=0 && nx < n && ny >= 0 && ny < m) {
					if (arr[nx][ny] == 1 && visited[nx][ny] == 0) {
						visited[nx][ny] = visited[cx][cy] + 1;
						q.add(new int[]{nx,ny});
					}
				}
			}
		}
		return visited[n-1][m-1];
	}

}
