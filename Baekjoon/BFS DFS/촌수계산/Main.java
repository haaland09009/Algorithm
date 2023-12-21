//https://www.acmicpc.net/problem/2644
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Main {
	static int n, m;
	static int[][] arr;
	static int[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 전체 사람의 수
		n = Integer.parseInt(br.readLine());
		
		// 배열
		arr = new int[n+1][n+1];
		// 방문 
		visited = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 촌수 계산 번호
		int node1 = Integer.parseInt(st.nextToken());
		int node2 = Integer.parseInt(st.nextToken());
		
		// 부모 자식들 간의 관계의 개수
		int m = Integer.parseInt(br.readLine());
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = 1;
		}
		
		System.out.println(bfs(node1, node2));
		
	}
	
	public static int bfs(int node1, int node2) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(node1);
		while (!q.isEmpty()) {
			int curNode = q.poll();
			if (curNode == node2) 
				return visited[curNode];
			for (int i=1; i<n+1; i++) {
				if (arr[curNode][i] == 1 && visited[i] == 0 && i != node1) {
					visited[i] = visited[curNode] + 1;
					q.add(i);
				}
			}
		}
		return -1;
	}

}
