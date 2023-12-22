// https://school.programmers.co.kr/learn/courses/30/lessons/49994
import java.util.*;
class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    public int solution(String dirs) {
        int answer = 0;
        
        String directions = "LRUD";
        int x = 5;
        int y = 5;
        
        Set<String> set = new HashSet<>();
        for (int i=0; i<dirs.length(); i++) {
            int idx = directions.indexOf(dirs.charAt(i));
            int nx = x + dx[idx];
            int ny = y + dy[idx];
            if (nx >= 0 && nx < 11 && ny >= 0 && ny < 11) {
                String str1 =  String.valueOf(x) + String.valueOf(y);
                String str2 =  String.valueOf(nx) + String.valueOf(ny);
                set.add(str1 + str2);
                set.add(str2 + str1);
                x = nx; y = ny;
            } 
        }
    
        return set.size() / 2;
    }
}
