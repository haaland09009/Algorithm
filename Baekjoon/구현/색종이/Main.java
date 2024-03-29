//https://www.acmicpc.net/problem/2563
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[101][101];
		for (int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			for (int j=x; j<x+10; j++) {
				for (int k=y; k<y+10; k++) {
					arr[j][k]++;
				}
			}
		}
		
		int cnt = 0;
		
		for (int i=0; i<101; i++) {
			for (int j=0; j<101; j++) {
				if (arr[i][j] > 0) {
					cnt++;
				}
			}
		}		
		
		System.out.println(cnt);
		
	}
}
