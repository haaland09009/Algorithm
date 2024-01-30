// https://school.programmers.co.kr/learn/courses/30/lessons/131704
import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        int i = 1;
        int cnt = 0;
        Stack<Integer> stack  = new Stack<>();
        while (i != order.length+1) {
            stack.add(i);
            while (!stack.isEmpty() && stack.peek() == order[cnt]) {
                stack.pop();
                cnt++;
            }
            i++;
        }
        answer = cnt;
        return answer;
    }
}
