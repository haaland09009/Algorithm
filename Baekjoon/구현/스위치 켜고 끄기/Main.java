//https://www.acmicpc.net/problem/1244
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		arr[0] = 0;
		for (int i=1; i<n+1; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		

		int m = Integer.parseInt(br.readLine());
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int gender = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			
			// 남학생일 경우
			if (gender == 1) {
				for (int j=number; j<n+1; j+=number) {
					switchArr(j);	
				}
			} // 여학생일 경우 
			else if (gender == 2) {
				switchArr(number);
				int idx = 1;
				while (number-idx >= 1 && number+idx <= n) {
					if (arr[number-idx] == arr[number+idx]) {
						switchArr(number-idx);
						switchArr(number+idx);
						idx++;
					} else {
						break;
					}
				}
			}
	
		}	
		
		for (int k=1; k<n+1; k++) {
			if (k % 20 == 0) {
				sb.append(arr[k]).append("\n");
			} else {
				sb.append(arr[k] + " ");
			}
		}
		
		System.out.println(sb);				

		
	}
	public static void switchArr(int num) {
		if (arr[num] == 1)
			arr[num] = 0;
		else
			arr[num] = 1;
	}
}
