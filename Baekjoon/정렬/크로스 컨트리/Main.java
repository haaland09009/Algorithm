//https://www.acmicpc.net/problem/9017
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			Map<Integer, Integer> map = new HashMap<>();
			Map<Integer, ArrayList<Integer>> map1 = new HashMap<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<n; j++) {
				int team = Integer.parseInt(st.nextToken());
				arr[j] = team;
				map.put(team, map.getOrDefault(team, 0) + 1);
			}
			
			
			int rank = 0;
			for (int k=0; k<arr.length; k++) {
				if (map.get(arr[k]) >= 6) {
					rank++;
					if (!map1.containsKey(arr[k])) {
						ArrayList<Integer> list = new ArrayList<>();
						list.add(rank);
						map1.put(arr[k], list);
					} else {
						map1.get(arr[k]).add(rank);
					}
				}
			}
			
			List<Integer> scoredTeams = new ArrayList<>(map1.keySet());
			scoredTeams.sort((a,b) -> {
				
				int a5_score = map1.get(a).get(4);
				int b5_score = map1.get(b).get(4);
				int total_5 = Integer.compare(a5_score, b5_score);
		
				int a_total = 0;
				int b_total = 0;
				for (int m=0; m<4; m++) {
					a_total += map1.get(a).get(m);
					b_total += map1.get(b).get(m);
				}
				
				int total = Integer.compare(a_total, b_total);
				if (total != 0)
					return total;
				
				return total_5;
			});
		    
		    System.out.println(scoredTeams.get(0));

		}
	}
}
