// https://school.programmers.co.kr/learn/courses/30/lessons/12899
import java.util.*;
class Solution {
    public String solution(int n) {
        
        StringBuilder sb = new StringBuilder();       
        while (n > 0) {
            if (n % 3 > 0) {
                sb.append(String.valueOf(n % 3));
                n = n / 3;
            } else {
                sb.append("4");
                n = n / 3 - 1;
            }
        }
        
        return sb.reverse().toString();
    }
}
