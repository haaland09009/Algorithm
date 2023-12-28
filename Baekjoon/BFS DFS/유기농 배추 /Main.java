//https://www.acmicpc.net/problem/1012
// 메모리 15948kb 시간 176ms 	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int m, n;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			arr = new int[m][n];
			visited = new boolean[m][n];
			for (int j=0; j<k; j++) {
				 st = new StringTokenizer(br.readLine(), " ");
				 int x =  Integer.parseInt(st.nextToken());
				 int y =  Integer.parseInt(st.nextToken());
				 arr[x][y] = 1;
			}
			int cnt = 0;
			for (int w=0; w<m; w++) {
				for (int h=0; h<n; h++) {
					if (arr[w][h] == 1 && !visited[w][h]) {
						bfs(w,h);
						cnt++;
					}
				}
			}			
			System.out.println(cnt);
		}
		
		
	}
	
	public static void bfs(int x, int y) {
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		visited[x][y] = true;
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			for (int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
					if (arr[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}
		
	}
}
