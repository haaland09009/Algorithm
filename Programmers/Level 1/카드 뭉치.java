// https://school.programmers.co.kr/learn/courses/30/lessons/159994
import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for (String card : cards1) {
            q1.add(card);
        }
        
        for (String card : cards2) {
            q2.add(card);
        }
        
        for (int i=0; i<goal.length; i++) {
            if ((q1.size() > 0) && (q1.peek().equals(goal[i]))) {
                q1.poll();
            } else if ((q2.size() > 0) && (q2.peek().equals(goal[i]))) {
                q2.poll();
            } else {
                answer = "No";
                break;
            }      
        }  
        return answer;
    }
}
