//https://www.acmicpc.net/problem/1697
// 메모리 15948kb 시간 176ms	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,k;
	static int[] dp;
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		dp = new int[100001];
		
		System.out.println(bfs());

	}
	public static int bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		while (!q.isEmpty()) {
			int x = q.poll();
			if (x == k) 
				return dp[k];
			int[] arr = {x-1, x+1, x*2};
			for (int a : arr) {
				if (a >= 0 && a < 100001 && dp[a] == 0) {
					dp[a] = dp[x] + 1;
					q.add(a);
				}
			}
		}
		return -1;
	}
}
