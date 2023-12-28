//https://www.acmicpc.net/problem/1743
// 메모리 15696kb 시간 176ms 	
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
	static int m,n;
	static String[][] arr;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new String[m][n];
		visited = new boolean[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				arr[i][j] = ".";
			}
		}
		
		for (int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			arr[x][y] = "#";
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (arr[i][j].equals("#") && !visited[i][j]) {
					list.add(bfs(i,j));
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		
		
	}
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
				if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
					if (arr[nx][ny].equals("#") && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.add(new int[] {nx,ny});
						cnt++;
					}
				}
			}
		}

		return cnt;
	}
}
