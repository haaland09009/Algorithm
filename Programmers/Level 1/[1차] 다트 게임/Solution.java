// https://school.programmers.co.kr/learn/courses/30/lessons/17682
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
      
        Stack<Integer> stack = new Stack<>();
        dartResult = dartResult.replaceAll("10", "%");
  
        for (int i=0; i<dartResult.length(); i++) {
            if (Character.isDigit(dartResult.charAt(i))) {
                stack.push(Integer.parseInt(dartResult.substring(i, i+1)));
            } else if (dartResult.charAt(i) == '%') {
                stack.push(10);
            } else {
                Integer score = stack.pop();
                
                if (dartResult.charAt(i) == 'S') {
                    stack.push(score);
                } else if (dartResult.charAt(i) == 'D') {
                    stack.push((int) Math.pow(score, 2));
                } else if (dartResult.charAt(i) == 'T') {
                    stack.push((int) Math.pow(score, 3));
                } else if (dartResult.charAt(i) == '*') {
                    if (stack.size() >= 1) {
                        Integer prevScore = stack.pop();
                        stack.push(prevScore * 2);
                        stack.push(score * 2);
                    } else {
                        stack.push(score * 2);
                    }
                } else if (dartResult.charAt(i) == '#') {
                    stack.push(score * (-1));
                } 
            }
        }
       
        for (int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }
        
        return answer;
    }
}
