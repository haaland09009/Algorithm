//https://www.acmicpc.net/problem/1260
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int n,m,v;
	public static int[][] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 정점의 수
		n = Integer.parseInt(st.nextToken());
		// 간선의 수
		m = Integer.parseInt(st.nextToken());
		// 탐색을 시작할 정점의 번호
		v = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		
		// 배열
		arr = new int[n+1][n+1];
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(v);
		sb.append("\n");
		// 방문 여부 초기화하고 bfs 실행
		visited = new boolean[n+1];
		bfs(v);
		System.out.println(sb);
		
	}
	
	// 깊이 우선 탐색
	public static void dfs(int node) {
		visited[node] = true;
		sb.append(node + " ");
		for (int i=1; i<n+1; i++) {
			if (arr[node][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	// 너비 우선 탐색
	public static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		while (!queue.isEmpty()) {
			int num = queue.poll();
			sb.append(num + " ");
			for (int i=1; i<n+1; i++) {
				if (arr[num][i] == 1 && !visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
	
}
