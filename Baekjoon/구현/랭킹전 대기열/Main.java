//https://www.acmicpc.net/problem/20006
// 메모리 16636KB, 시간 188ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int p = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, ArrayList<String>> team = new HashMap<>();
		Map<String, Integer> level = new HashMap<>();
		
		int cnt = 0;
		for (int i=0; i<p; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int l = Integer.parseInt(st.nextToken());
			String n = st.nextToken();
			
			// 처음에 방이 아무것도 없을 경우
			if (team.size() == 0) {
				ArrayList<String> list = new ArrayList<>();
				cnt++;
				list.add(n);
				team.put(cnt, list);		
				level.put(n, l);
				continue;
			}
			
			boolean isEnter = false;
			for (int key : team.keySet()) {
				int lev = level.get(team.get(key).get(0));
				if (l >= lev-10 && l <= lev+10 && team.get(key).size() < m) {
					team.get(key).add(n);
					level.put(n,l);
					isEnter = true;	
					break;
				}
			}
			
			if (!isEnter) {
				ArrayList<String> list = new ArrayList<>();
				cnt++;
				list.add(n);
				team.put(cnt, list);		
				level.put(n, l);
			}

		}
		
		// 사전 순으로 정렬
		for (Integer key : team.keySet()) {
			ArrayList<String> list = team.get(key);
			Collections.sort(list);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int key : team.keySet()) {
			if (team.get(key).size() == m) {
				sb.append("Started!" + "\n");
			} else {
				sb.append("Waiting!" + "\n");
			}
			for (int i=0; i<team.get(key).size(); i++) {
				String name = team.get(key).get(i);
				sb.append(level.get(name) + " " + name + "\n");
			}				
		}
		
		System.out.println(sb);
}
}
