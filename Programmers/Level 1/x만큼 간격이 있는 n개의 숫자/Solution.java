// https://school.programmers.co.kr/learn/courses/30/lessons/12954
import java.util.*;
class Solution {
    public long[] solution(int x, int n) { 
        long[] answer = {};
        
        List<Long> list = new ArrayList<>();
        
        for (int i=1; i<=n; i++) {
            list.add((long) x*i);
        }
        
        answer = new long[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
