//https://www.acmicpc.net/problem/1758
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr= new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long answer = 0;
		for (int i=0; i<n; i++) {
			int money = arr[n-1-i] - i;
			if (money > 0) {
				answer += money;
			} else {
				break;
			}
		}
		
		System.out.println(answer);
	}
}
