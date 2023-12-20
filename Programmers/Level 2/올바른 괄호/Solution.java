// https://school.programmers.co.kr/learn/courses/30/lessons/12909
import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;   
            } else if (s.charAt(i) == ')') {
                if (count > 0) {
                    count--;
                } else {
                    answer = false;
                    break;
                }
            }
        }
        
        if (count > 0) {
            answer = false;
        }
        
        
        return answer;
    }
}
