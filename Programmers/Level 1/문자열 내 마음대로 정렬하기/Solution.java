// https://school.programmers.co.kr/learn/courses/30/lessons/12915
import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        for (int i=0; i<strings.length; i++) {
            strings[i] = strings[i].substring(n, n+1) + strings[i];
        }
        Arrays.sort(strings);
        
        answer = new String[strings.length];
        for (int i=0; i<strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        
        return answer;
    }
}
