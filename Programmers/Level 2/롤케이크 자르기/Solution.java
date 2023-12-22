// https://school.programmers.co.kr/learn/courses/30/lessons/132265
import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int t : topping) {
            map.put(t, map.getOrDefault(t,0)+1);
            set.add(t);
        }
        
        int cnt = set.size();
        Set<Integer> keySet = new HashSet<>();
        for (int t : topping) {
            keySet.add(t);
            map.put(t, map.get(t)-1);
            if (map.get(t) == 0)
                cnt--; 
            if (cnt == keySet.size())
                answer++;
        }
     
       
        return answer;
    }
}
