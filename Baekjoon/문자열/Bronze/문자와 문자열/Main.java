//https://www.acmicpc.net/problem/27866

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int idx = Integer.parseInt(br.readLine());
		
		System.out.println(word.substring(idx-1, idx));
	
 }
}
