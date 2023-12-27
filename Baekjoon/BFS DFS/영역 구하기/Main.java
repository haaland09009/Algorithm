//https://www.acmicpc.net/problem/2583
// 메모리 : 15904kb , 시간 : 156ms
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
	static int[][] arr;
	static boolean[][] visited;
	static int n,m;
	static int[] dx = {0,0,-1,1};
	static int[] dy  = {-1,1,0,0};
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for (int j=x1; j<x2; j++) {
				for (int l=y1; l<y2;  l++) {
					arr[j][l]++;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (arr[i][j] == 0 && !visited[i][j]) {
					list.add(bfs(i,j));
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for (int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");

		
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
				if (nx >= 0 && nx <n && ny >= 0 && ny < m) {
					if (arr[nx][ny] == 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						cnt++;
						q.add(new int[] {nx,ny});
					}
				}
			}
			}
		
		return cnt;
	}
}
