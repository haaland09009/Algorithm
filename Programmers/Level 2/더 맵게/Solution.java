// https://school.programmers.co.kr/learn/courses/30/lessons/42626
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) 
            queue.offer(s);
        
        while (queue.peek() < K) {
            int first = queue.poll();
            int second = queue.poll();
            queue.offer(first + second * 2);
            answer++;
            if (queue.size() == 1 && queue.peek() < K) {
                answer = -1;
                break;
            }
        }
        

        return answer;
    }
}


/*
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        
        for (int s : scoville) {
            queue.add(s);
        }
        
        while (queue.peek() < K) {
            int first = queue.poll();
            int second = queue.poll();
            int mix = first + second * 2;
            queue.add(mix);
            answer++;
            if (queue.size() <= 1 && queue.peek() < K) {
                answer = -1;
                break;
            } 
        }
     
        
        return answer;
    }
}
*/
