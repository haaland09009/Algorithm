// https://school.programmers.co.kr/learn/courses/30/lessons/12921
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            if (isPrimeNumber(i))
                answer++;
        }
        
        return answer;
    }
    
    public boolean isPrimeNumber(int n) {
        if (n <= 1) 
            return false;
        for (int i=2; i<(int)(Math.sqrt(n))+1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
}
