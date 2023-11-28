// https://school.programmers.co.kr/learn/courses/30/lessons/68935
 
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = "";
        while (n != 0) {
            str += String.valueOf(n % 3);
            n = n / 3;
        }
        
        String[] arr = str.split("");

        for(int i=0; i<arr.length; i++) {
            answer += Integer.parseInt(arr[i]) * (int)Math.pow(3, arr.length-1-i);
        }
        

        return answer;
    }
}
