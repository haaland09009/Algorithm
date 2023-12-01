// https://school.programmers.co.kr/learn/courses/30/lessons/42889
import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int s : stages) {
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        int count = stages.length;
        Map<Integer, Double> map1 = new HashMap<>();
        for (int i=1; i<=N; i++) {
            if (map.containsKey(i)) {
                map1.put(i, (double) map.get(i) / count);        
                count -= map.get(i);
            } else {
                map1.put(i, (double) 0);

            }
        }
        
        List<Integer> keySet = new ArrayList<>(map1.keySet());
        keySet.sort((o1, o2) -> Double.compare(map1.get(o2), map1.get(o1)));       
  
        for (int i=0; i<keySet.size(); i++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}
