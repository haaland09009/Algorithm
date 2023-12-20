// https://school.programmers.co.kr/learn/courses/30/lessons/12932
import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        String s = String.valueOf(n);
        String[] arr = s.split("");
        
        for(int i=arr.length-1; i>=0; i--) {
            list.add(Integer.parseInt(arr[i]));
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
    
        return answer;
    }
}
