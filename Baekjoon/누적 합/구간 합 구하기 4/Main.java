//https://www.acmicpc.net/problem/11659
// 메모리 59624kb 시간 700ms		
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 0 5 9 12 14 15
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sum_list = new int[n+1];
		int tmp = 0;
		for (int i=0; i<n; i++) {
			tmp += arr[i];
			sum_list[i+1] = tmp;
		}
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			sb.append(sum_list[y] - sum_list[x-1]).append("\n");
		}
		System.out.println(sb);
		
	}
}
