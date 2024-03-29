// https://school.programmers.co.kr/learn/courses/30/lessons/131127
import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            map.put(want[i], number[i]);
        }

        
        for (int i=0; i<=discount.length-10; i++) {
            Map<String, Integer> map1 = new HashMap<>();
            boolean result = true;
            for (int j=i; j<i+10; j++) {
                map1.put(discount[j], map1.getOrDefault(discount[j],0)+1);
            }
            
            for (String key : map.keySet()) {
                if (map.get(key) != map1.get(key)) {
                    result = false;
                    break;
                }
            }
            
            if (result) {
                answer++;
            }
        }
        return answer;
    }
}
