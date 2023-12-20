// https://school.programmers.co.kr/learn/courses/30/lessons/138476
import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1,o2) -> map.get(o2) - map.get(o1));
        
        for (Integer key : list) {
            k -= map.get(key);
            answer++;
            if (k <= 0) {
                break;
            }
        }
  
        return answer;
    }
}
