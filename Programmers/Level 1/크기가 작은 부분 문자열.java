// https://school.programmers.co.kr/learn/courses/30/lessons/147355
import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        Long value = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-length; i++) {
            Long num = Long.parseLong(t.substring(i, i+length));
            if (num <= value) {
                answer++;
            }
        }
        
        return answer;
    }
}
