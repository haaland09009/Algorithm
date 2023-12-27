//https://www.acmicpc.net/problem/10709
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder  sb = new StringBuilder();
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			char[][] arr = new char[h][w];
			
			for (int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine(), "");
				String str = st.nextToken();
				for (int j=0; j<w; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			for (int i=0; i<h; i++) {
				boolean isCloud = false;
				int idx = -1;
				for (int j=0; j<w; j++) {
					if (arr[i][j] == 'c') {
						isCloud = true;
						idx = j;
						sb.append(0 + " ");
					} else {
						if (isCloud) {
							sb.append(j-idx + " ");
						} else {
							sb.append(-1 + " ");
						}
					}
				}
				sb.append("\n");
			}
			
			System.out.println(sb);

	}
}
