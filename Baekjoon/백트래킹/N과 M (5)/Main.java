//https://www.acmicpc.net/problem/15654
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int n;
	public static int m;
	public static int[] arr;
	public static int[] result;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		result = new int[m];
		visited = new boolean[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		dfs(0);
		System.out.println(sb);
		
	}
	
	public static void dfs(int depth) {
		if (depth == m) {
			for (int val : result)  {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for (int i=0; i<n; i++) {
			if (!visited[i]) {
				result[depth] = arr[i];
				visited[i] = true;
				dfs(depth+1);
				visited[i] = false;
			}
		}
	}
	
}
