// https://school.programmers.co.kr/learn/courses/30/lessons/42576
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            if (map.containsKey(c)) {
                int value = map.get(c);
                map.put(c, value-1);
            }
        }
        
        // List<String> list = new ArrayList<>(map.keySet());
        // list.sort((o1,o2) -> map.get(o2) - map.get(o1));
        // answer = list.get(0);
        // return answer;
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}
