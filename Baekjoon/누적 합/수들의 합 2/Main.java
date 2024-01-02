//https://www.acmicpc.net/problem/2003
// 메모리 14996kb 시간 148ms	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException	 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		int[] sum_arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine(), " ");
		int tmp_sum = 0;
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			tmp_sum += arr[i];
			sum_arr[i+1] = tmp_sum;
		}
		

		int left = 0;
		int right = 1;
		
		int answer = 0;
		while (right <= n) {
			if (sum_arr[right] - sum_arr[left] == m) {
				answer++;
				left++;
			} else if (sum_arr[right] - sum_arr[left]  < m) {
				right++;
			} else {
				left++;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
