// https://school.programmers.co.kr/learn/courses/30/lessons/17687
import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        
        StringBuilder convert = new StringBuilder();
        StringBuilder answer = new StringBuilder();
    
        for (int i=0; i<=t*m; i++) {
            convert.append(Integer.toString(i, n));
        }
        
        for (int i=p-1; i<t*m; i+=m) {
            answer.append(convert.substring(i, i+1));
        }
    
        
        return answer.toString().toUpperCase();
    }
}

/* 
class Solution {
    public String solution(int n, int t, int m, int p) {
        
        StringBuilder str = new StringBuilder();
        for (int i=0; i<=t*m; i++) {
            str.append(convert(i, n));
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i=p-1; i<=t*m; i+=m) {
            answer.append(str.substring(i, i+1));
            if (answer.toString().length() == t) {
                break;
            }
        }
        return answer.toString();
    }
    
    
    private String convert(int num, int n) {
        String a = "0123456789ABCDEF";
        String str = "";
        if (num == 0) {
            return "0";
        }
        while (num > 0) {
            str = String.valueOf(a.charAt(num % n)) + str;
            num = num / n;
        }
        return str;
    }
} 
*/
