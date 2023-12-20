// https://school.programmers.co.kr/learn/courses/30/lessons/76502
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
       
        for (int i=0; i<s.length(); i++) {
            if (isCorrect(s.substring(i) + s.substring(0, i))) {
                answer++;
            }
        }
        return answer;
    }
    
    
    public boolean isCorrect(String s) {
        
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == 0) {
                    result = false;
                    break;
                } else {
                    if ((s.charAt(i) == ')') && (stack.peek() == '(')) {
                        stack.pop();
                    } else if ((s.charAt(i) == ']') && (stack.peek() == '[')) {
                        stack.pop();
                    } else if ((s.charAt(i) == '}') && (stack.peek() == '{')) {
                        stack.pop();
                    }
                }   
            }
        }
        
        if (!stack.isEmpty()) {
            result = false;
        }
        return result;
    }
    
}
