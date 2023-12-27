//https://www.acmicpc.net/problem/2852
// 메모리 : 16244KB / 시간 : 160ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    // 골이 들어간 횟수
		int n = Integer.parseInt(br.readLine());
		
		int length = 48 * 60 ;
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];
		
		for (int i=0; i<n; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
			int team = Integer.parseInt(st.nextToken());
			String scoreTime = st.nextToken();
			int minutes = Integer.parseInt(scoreTime.split(":")[0]) * 60;
			int seconds =Integer.parseInt(scoreTime.split(":")[1]);
			int time = minutes + seconds;
			if (team == 1) {
				for (int j=time; j<length; j++)
					arr1[j]++;
			} else {
				for (int j=time; j<length; j++)
					arr2[j]++;
			}
		}
		
		int winningTime1 = 0;
		int winningTime2 = 0;
		
		for (int i=0; i<length; i++) {
			if (arr1[i] > arr2[i]) {
				winningTime1++;
			} else if (arr1[i] < arr2[i]) {
				winningTime2++;
			}
		}
		
		String minute1 = String.valueOf(winningTime1 / 60);
		String second1 = String.valueOf(winningTime1 % 60);
	
		
		String minute2 = String.valueOf(winningTime2 / 60);
		String second2 = String.valueOf(winningTime2 % 60);
		
		System.out.println(formatTime(minute1) + ":"  + formatTime(second1));
		System.out.println(formatTime(minute2) + ":" + formatTime(second2));
		
		
		
	}
	public static String formatTime(String time) {
		if (Integer.parseInt(time) < 10) {
			time = "0" + time;
		}
		return time;
	}
}
