//https://www.acmicpc.net/problem/10431

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		
		for (int i=0; i<p; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[21];
			int cnt = 0;
			for (int j=0; j<21; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
	
			for (int k=1; k<20; k++) {
				for (int l=k+1; l<21; l++) {
					if (arr[k] > arr[l]) {
						int temp = arr[l];
						arr[l] = arr[k];
						arr[k] = temp;
						cnt++;
					}
				}
			}
			System.out.println(i+1 + " " + cnt);
	
		}
		
	}
}
