// https://school.programmers.co.kr/learn/courses/30/lessons/138477

// 1. 우선순위 큐를 이용한 풀이
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int i=0; i<score.length; i++) {
            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }
            answer[i] = q.peek();
        }
        
        return answer;
    }
}


//////////////////////////////////////////////////////////////////////
// 2. 우선순위 큐를 이용하지 않은 풀이
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        // 최종 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        for (int s : score) {
            if (list.size() < k) {
                list.add(s);
            } else {
                if (s > list.get(0)) {
                    list.remove(0);
                    list.add(s);
                }
            }
            Collections.sort(list); 
            result.add(list.get(0));
        }
      
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
      
        return answer;
    }
}
