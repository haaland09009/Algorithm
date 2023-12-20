// https://school.programmers.co.kr/learn/courses/30/lessons/42587
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<priorities.length; i++) {
            map.put(i, priorities[i]);
            list.add(i);
        }
        
        while (true) {
            // 대기중인 프로세스 꺼내기
            int job = list.remove(0);
            // 실행 여부
            boolean executed = true;
            for (int other_job : list) {
                // 우선순위가 더 높은 프로세스가 있다면
                if (map.get(job) < map.get(other_job)) {
                    list.add(job);
                    executed = false;
                    break;   
                }
            }
            
            // 실행 가능할 경우
            if (executed) {
                answer++;
                if (job == location)
                    break;
            }    
        }
        
  
        return answer;
    }
}
