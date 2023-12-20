//https://www.acmicpc.net/problem/15650 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static int n;
	public static int m;
	public static int[] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n];
		
		dfs(0, 0);
		System.out.println(sb);
	
	}
	
	public static void dfs(int num, int depth) {
		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for (int i=num; i<n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i+1;
				dfs(i+1, depth+1);
				visited[i] = false;
			}
		}
	}

}
