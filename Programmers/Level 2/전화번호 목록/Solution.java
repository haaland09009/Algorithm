// https://school.programmers.co.kr/learn/courses/30/lessons/42577
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> map = new HashMap<>();
        for (String phone : phone_book) {
            map.put(phone, map.getOrDefault(phone, 0) + 1);
        }
        
        for (String phone : phone_book) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<phone.length(); i++) {
                sb.append(phone.substring(i, i+1));
                if (map.containsKey(sb.toString()) && !phone.equals(sb.toString())) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}
