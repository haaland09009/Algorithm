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
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        int max = 0;
        for (char key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        int cnt = 0;
        List<Character> list = new ArrayList<>();
        for (char key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
                cnt++;
            }
        }

        if (cnt >= 2) {
            System.out.println("?");
        } else {
            System.out.println(list.get(0));
        }

    }
}

