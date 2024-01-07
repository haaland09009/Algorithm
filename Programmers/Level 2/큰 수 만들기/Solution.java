// https://school.programmers.co.kr/learn/courses/30/lessons/42883
import java.util.*;
class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        char[] arr = number.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        for (char num : arr) {
            while (stack.size() > 0 && stack.peek() < num && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }
        
        if (k > 0) {
            for (int i=0; i<stack.size()-k; i++) {
                sb.append(stack.get(i));
            }
            return sb.toString();
        }

        for (int i=0; i<stack.size(); i++) {
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}
