//https://www.acmicpc.net/problem/2606
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int n, m;
	public static int[][] arr;
	public static  boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 컴퓨터 수
		n = Integer.parseInt(br.readLine());
		// 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수
		m = Integer.parseInt(br.readLine());
		
		// 방문 여부
		visited = new boolean[n+1];
		
		// 배열
		arr = new int[n+1][n+1];
		
		for (int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		
		bfs(1);
		
		int answer = 0;
		for (int i=1; i<n+1; i++) {
			if (visited[i] && i != 1) 
				answer++;
		}
		
		System.out.println(answer);
			
 }
	public static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			int num = queue.poll();
			for (int i=0; i<n+1; i++) {
				if (arr[num][i] == 1 && !visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
