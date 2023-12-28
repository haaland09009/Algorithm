//https://www.acmicpc.net/problem/11724
// 메모리 115772kb 시간 552ms 	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = 1;
		}
		
		int cnt = 0;
		for (int i=1; i<n+1; i++) {
			if (!visited[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	public static void dfs(int p) {
		
		visited[p] = true;
		for (int i=1; i<n+1; i++) {
			if (arr[p][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
}
