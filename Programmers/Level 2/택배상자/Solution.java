// https://school.programmers.co.kr/learn/courses/30/lessons/131704
import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int i = 1;
        
        int cnt = 0;
        Stack<Integer> container = new Stack<>();
        while (i != order.length+1) {
            container.push(i);
            while (!container.isEmpty() && container.peek() == order[cnt]) {
                cnt++;
                container.pop();
            }
            i++;
        }
        
        answer = cnt;
        return answer;
    }
}
