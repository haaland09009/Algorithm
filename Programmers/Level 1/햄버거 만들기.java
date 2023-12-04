// https://school.programmers.co.kr/learn/courses/30/lessons/133502
// 더 빠른 코드
import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        int[] stack = new int[ingredient.length];
        int idx = 0;
        
        for (int i : ingredient) {
            stack[idx++] = i;
            if (idx >= 4 && stack[idx-1] == 1 && stack[idx-2] == 3 && stack[idx-3] == 2 && stack[idx-4] == 1) {
              idx -= 4;
              answer++;
            } 
        }
        
        return answer;
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////
// 직접 해결한 풀이
import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >= 4) {
               if (stack.get(stack.size()-1) == 1 && stack.get(stack.size()-2) == 3 && stack.get(stack.size()-3) == 2 && stack.get(stack.size()-4) == 1) {
                   stack.pop();
                   stack.pop();
                   stack.pop();
                   stack.pop();
                   answer++;
               }
            }
        }
        
        return answer;
    }
}
