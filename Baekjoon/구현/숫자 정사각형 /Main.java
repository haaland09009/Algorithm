//https://www.acmicpc.net/problem/1051
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int n, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for (int i=0; i<n; i++) {
			String number = br.readLine();
			for (int j=0; j<number.length(); j++) {
				int num = Integer.parseInt(number.substring(j, j+1));
				arr[i][j] = num;
			}
		}
		
		int length = Math.min(n, m);
		for (int i=length; i>=1; i--) {
			if (findSquare(i)) {
				System.out.println(i*i);
				break;
			}
		}
		

}
	private static boolean findSquare(int r) {
		
		for (int i=0; i<n-r+1; i++) {
			for (int j=0; j<m-r+1; j++) {
				if (arr[i][j] == arr[i][j+r-1] && arr[i][j+r-1] == arr[i+r-1][j+r-1] && arr[i+r-1][j+r-1] == arr[i+r-1][j]) {	
					return true;
				}
			}
		}
		return false;
	}
}
