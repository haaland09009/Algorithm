// https://school.programmers.co.kr/learn/courses/30/lessons/12939
import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
          
        
        return Collections.min(list) + " " + Collections.max(list);
    }
}
