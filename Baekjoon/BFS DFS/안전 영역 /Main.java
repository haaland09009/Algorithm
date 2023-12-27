	
//https://www.acmicpc.net/problem/2468
// 메모리 18108KB, 시간 224ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static boolean[][] visited;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		int max_height = 0;
		
		arr = new int[n][n];
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max_height = Math.max(max_height, arr[i][j]);
			}
		}
		
		int max_area = 1;
		for (int h=1; h<=max_height; h++) {
			visited = new boolean[n][n];
			int cnt = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (arr[i][j] > h && !visited[i][j]) {
						dfs(i,j,h);
						cnt++;
					}
				}
			}
			max_area = Math.max(max_area, cnt);
		}
		
		System.out.println(max_area);
		
		
	}
	public static void dfs(int x, int y, int height) {	
		visited[x][y] = true;
		for (int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if (arr[nx][ny] > height && !visited[nx][ny]) {
					dfs(nx,ny,height);
				}
			}
		}
	}
}    

//////////////////////////////////////////////////////
// 메모리 55712KB, 시간 308ms
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.StringTokenizer;

// public class Main {
// 	static int[][] arr;
// 	static int[] dx = {0,0,-1,1};
// 	static int[] dy = {-1,1,0,0};
// 	static boolean[][] visited;
// 	static int n;
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		n = Integer.parseInt(br.readLine());
		
// 		int max_height = 0;
		
// 		arr = new int[n][n];
// 		for (int i=0; i<n; i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
// 			for (int j=0; j<n; j++) {
// 				arr[i][j] = Integer.parseInt(st.nextToken());
// 				max_height = Math.max(max_height, arr[i][j]);
// 			}
// 		}
		
// 		int max_area = 1;
// 		for (int h=1; h<=max_height; h++) {
// 			visited = new boolean[n][n];
// 			int cnt = 0;
// 			for (int i=0; i<n; i++) {
// 				for (int j=0; j<n; j++) {
// 					if (arr[i][j] > h && !visited[i][j]) {
// 						bfs(i,j,h);
// 						cnt++;
// 					}
// 				}
// 			}
// 			max_area = Math.max(max_area, cnt);
// 		}
		
// 		System.out.println(max_area);
		
		
// 	}
// 	public static void bfs(int x, int y, int height) {
		
// 		Queue<int[]> q = new LinkedList<>();
// 		q.add(new int[] {x,y});
// 		visited[x][y] = true;
// 		while (!q.isEmpty()) {
// 			int[] cur = q.poll();
// 			int cx = cur[0];
// 			int cy = cur[1];
// 			for (int i=0; i<4; i++) {
// 				int nx = cx + dx[i];
// 				int ny = cy + dy[i];
// 				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
// 					if (arr[nx][ny] > height && !visited[nx][ny]) {
// 						visited[nx][ny] = true;
// 						q.add(new int[] {nx,ny});
// 					}
// 				}
// 			}
// 		}
		
// 	}
// }
