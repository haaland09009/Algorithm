//https://www.acmicpc.net/problem/15656
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[] arr;
	static int[] result;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		result = new int[m];
		
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
			for (int val : result) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i=0; i<n; i++) {
				result[depth] = arr[i];
				dfs(depth+1);
		
			}
		}

}
