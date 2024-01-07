// https://school.programmers.co.kr/learn/courses/30/lessons/42883
import java.util.*;
class Solution {
    public String solution(String number, int k) {
        
        char[] arr = number.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for (char num : arr) {
            while (!stack.isEmpty() && stack.peek() < num && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }
        
        StringBuilder sb = new StringBuilder();
        int length;
        if (k > 0) {
            length = stack.size() - k;
        } else {
            length = stack.size();
        }
        
        for (int i=0; i<length; i++) {
            sb.append(stack.get(i));
        }
        
        return sb.toString();
    }
}
