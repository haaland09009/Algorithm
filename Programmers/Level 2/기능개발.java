// https://school.programmers.co.kr/learn/courses/30/lessons/42586
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> pq = new LinkedList<>();
        for (int p : progresses) {
            pq.add(p);
        }
        
        Queue<Integer> sq = new LinkedList<>();
        for (int s : speeds) {
            sq.add(s);
        }        
        
        int days = 1;
        int count = 0;
        
        List<Integer> list = new ArrayList<>();
        while (pq.size() > 0) {
            int job = pq.peek();
            int speed = sq.peek();
            if (job + days * speed >= 100) {
                pq.poll();
                sq.poll();
                count++;
            } else {
                if (count > 0) {
                    list.add(count);
                    count = 0;
                } else {
                    days++;
                }
            }
        }
        
        if (count > 0) {
            list.add(count);
        }
        
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}
