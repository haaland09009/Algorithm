// https://school.programmers.co.kr/learn/courses/30/lessons/12981
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for(int i=1; i<words.length; i++) {
            if (words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                answer[0] = (i % n) + 1; answer[1] = (i / n) + 1;
                break;
            } else if (list.contains(words[i])) {
                answer[0] = (i % n) + 1; answer[1] = (i / n) + 1;
                break;
            }
            list.add(words[i]);
        }
      
        return answer;
    }
}
