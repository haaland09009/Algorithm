// https://school.programmers.co.kr/learn/courses/30/lessons/118667
import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long sum1 = getSum(queue1); 
        long sum2 = getSum(queue2);
        long midSum = (sum1 + sum2) / 2;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for (int i=0; i<queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        
        while (q1.size() > 0 && q2.size() > 0) {
            if (sum1 > midSum) {
                int num = q1.poll();
                sum1 -= (long) num;
            } else if (sum1 < midSum) {
                int num = q2.poll();
                q1.add(num);
                sum1 += (long) num;
            } else {
                return answer;
            }
            answer++;
        }
        
        
        return -1;
    }
    
    
    
    public long getSum(int[] queue) {
        
        long sum = 0;
        
        for (int q : queue)
            sum += (long) q;
        
        return sum;
        
    }
}
