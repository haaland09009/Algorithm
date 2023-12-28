//https://www.acmicpc.net/problem/11403
// 메모리 16328 kb, 시간 188 ms 		
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=0; i<n; i++) {
			visited = new boolean[n];
			for (int j=0; j<n; j++) {
				if (arr[i][j] == 1) {
					dfs(j);
				}
			}
			for (int k=0; k<n; k++) {
				if (visited[k])
					sb.append(1 + " ");
				else
					sb.append(0 + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);

	}
	
	public static void dfs(int p) {
		visited[p] = true;
		for (int i=0; i<n; i++) {
			if (arr[p][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
}
