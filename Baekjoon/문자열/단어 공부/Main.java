//https://www.acmicpc.net/problem/1157
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		for (int i=0; i<word.length(); i++) 
			arr[word.charAt(i) - 'A']++;
		
		int maxValue = -1;
		char answer = '?';
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
				answer = (char) (i+65);
			} else if (arr[i] == maxValue) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
	}
}




/////////////////////////////////////////////////////////
// 처음 해결한 풀이
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.HashMap; 
// import java.util.Map;

// public class Main {
// 	public static void main(String[] args) throws IOException {
		
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		String word = br.readLine().toUpperCase();
		
// 		Map<Character, Integer> map = new HashMap<>();
// 		int maxValue = 0;
		
// 		for (char letter : word.toCharArray()) {
// 			map.put(letter, map.getOrDefault(letter, 0)+1);
// 			maxValue = Math.max(maxValue, map.get(letter));
// 		}
		
// 		int cnt = 0;
// 		char answer = 0;
		
// 		for (char key : map.keySet()) {
// 			if (map.get(key) == maxValue) {
// 				cnt++;
// 				answer = key;
// 			}
// 		}
		
// 		if (cnt >= 2) {
// 			System.out.println("?");
// 		} else {
// 			System.out.println(answer);
// 		}
		
		
		
// 	}
// }
