//https://www.acmicpc.net/problem/2667
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	static int n;
	static int[][] arr;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 지도의 크기
		n = Integer.parseInt(br.readLine());
		// 배열
		arr = new int[n][n];
		// 방문 여부
		visited = new boolean[n][n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j=0; j<str.length(); j++) {
				arr[i][j] = Integer.parseInt(str.substring(j, j+1));
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					list.add(bfs(i,j));
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		
	}
	// 너비 우선 탐색
	public static int bfs(int x, int y) {
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		visited[x][y] = true;
		int cnt = 1;
		
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			for (int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (nx >= 0 && nx < n && ny >=0 && ny < n) {
					if (arr[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						cnt++;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}
		
		return cnt;
	}
}
