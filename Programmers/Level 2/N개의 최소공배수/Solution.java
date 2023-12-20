// https://school.programmers.co.kr/learn/courses/30/lessons/12953
import java.util.*;
class Solution {
    public int solution(int[] arr) {
 
        for (int i=1; i<arr.length; i++) {
            arr[i] = lcm(arr[i], arr[i-1]);
        }
        
        return arr[arr.length-1];
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) 
            return a;
        return gcd(b, a % b);    
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
