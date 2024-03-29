// https://school.programmers.co.kr/learn/courses/30/lessons/76502
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int length = s.length();
        
        for (int i=0; i<length; i++) {
            String word = s.substring(i) + s.substring(0, i);
            if (isCorrect(word)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isCorrect(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
