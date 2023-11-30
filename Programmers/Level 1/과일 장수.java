// https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
  
        Arrays.sort(score);
      
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=score.length-1; i>=0; i--) {
            q.add(score[i]);
            if (q.size() == m) {
                answer += q.peek() * q.size();
                q.clear();
            }
        }
        
        
        return answer;
    }
}

//////////////////////////////////////////////////
