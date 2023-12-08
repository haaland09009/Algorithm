// https://school.programmers.co.kr/learn/courses/30/lessons/87390
import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for(long i=left; i<=right; i++) {
            list.add((int)(Math.max(i/n, i%n)+1));    
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
