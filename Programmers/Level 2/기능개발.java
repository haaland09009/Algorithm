// https://school.programmers.co.kr/learn/courses/30/lessons/42586
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int days = 1;
        Queue<Integer> progressQueue = new LinkedList<>();
        for (int p : progresses) 
            progressQueue.add(p);

        Queue<Integer> speedQueue = new LinkedList<>();
        for (int s : speeds) 
            speedQueue.add(s);        
        
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (progressQueue.size() > 0) {
            int job = progressQueue.peek();
            int speed = speedQueue.peek();
            if (job + days * speed >= 100) {
                progressQueue.poll();
                speedQueue.poll();
                count++;
            } else {
                if (count > 0) {
                    list.add(count);
                    count = 0;
                } else {
                    days += 1;
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
