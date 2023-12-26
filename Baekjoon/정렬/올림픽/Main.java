//https://www.acmicpc.net/problem/8979
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<ArrayList<Integer>> list = new ArrayList<>();
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int j=0; j<4; j++)
				tmp.add(Integer.parseInt(st.nextToken()));
			list.add(tmp);
		}
		
		list.sort((a,b) -> {
			int compare3 = b.get(3).compareTo(a.get(3));
			int compare1 = b.get(1).compareTo(a.get(1));
			if (compare1 != 0) 
				return compare1;
			
			int compare2 = b.get(2).compareTo(a.get(2));
			if (compare2 != 0)
				return compare2;
			
			return compare3;
		});
		
		
		int rank = 0;
		int same_rank = 0;
		for (int i=0; i<list.size(); i++) {
			rank++;
			if (i >= 1 && list.get(i).get(1) == list.get(i-1).get(1) &&  list.get(i).get(2) == list.get(i-1).get(2) 
					&& list.get(i).get(3) == list.get(i-1).get(3)) {
				same_rank++;
			} else {
				same_rank = 0;
			}
			
			if (k == list.get(i).get(0)) {
				break;
			}			
		}
		
		System.out.println(rank - same_rank);
		
	}
}
