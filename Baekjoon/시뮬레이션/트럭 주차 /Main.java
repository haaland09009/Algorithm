//https://www.acmicpc.net/problem/2979
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[101];
		for (int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start_time = Integer.parseInt(st.nextToken());
			int end_time = Integer.parseInt(st.nextToken());
			for (int t=start_time; t<end_time; t++) 
				arr[t]++;
		}
		
		int answer = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == 1) {
				answer += arr[i] * a;
			} else if (arr[i] == 2) {
				answer += arr[i] * b;
			} else if (arr[i] == 3) {
				answer += arr[i] * c;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
