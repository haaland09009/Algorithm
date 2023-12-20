// https://school.programmers.co.kr/learn/courses/30/lessons/131701
import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;

        int tmp = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<elements.length; i++) {
            tmp = elements[i];
            set.add(tmp);
            for(int j=i+1; j < i+elements.length; j++) {
                tmp += elements[j % elements.length];
                set.add(tmp);
            }
        }
     
        return set.size();
    }
}
