// https://school.programmers.co.kr/learn/courses/30/lessons/17684
import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        
        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> list = new ArrayList<>();
        for (int i=0; i<str.length(); i++) {
            list.add(str.substring(i, i+1));
        }
      
        int start = 0;
        int end = 0;
        
        List<Integer> result = new ArrayList<>();
        while (true) {
            end++;
            if (end == msg.length()) {
                result.add(list.indexOf(msg.substring(start, end)));
                break;
            }
            if (!list.contains(msg.substring(start, end+1))) {
                list.add(msg.substring(start, end+1));
                result.add(list.indexOf(msg.substring(start, end)));
                start = end;
            }
        }
        
        answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
