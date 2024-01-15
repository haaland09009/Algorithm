// https://school.programmers.co.kr/learn/courses/30/lessons/42842
import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        List<Integer> list = new ArrayList<>();
        for (int i=sum; i>0; i--) {
            if (sum % i == 0) {
                list.add(i);
            }
        }
        
        for (int i=0; i<list.size(); i++) {
            int b = list.get(i);
            int y = sum / b;
            if ((b-2) * (y-2) == yellow) {
                answer[0] = b;
                answer[1] = y;
                break;
            }
        }
        
      
        
        return answer;
    }
}
