// https://school.programmers.co.kr/learn/courses/30/lessons/92335
import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String number = convert(n, k);
        String[] arr = number.split("0");
       
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length() > 0) {
                Long data = Long.parseLong(arr[i]);
                if (isPrimeNumber(data)) {
                    answer++;
                }
            }
        }        
        return answer;
    }
    
    // 소수 여부 확인 함수
    public boolean isPrimeNumber(Long num) {
        if (num <= 1) 
            return false;
        else {
            for (int i=2; i<(int)(Math.sqrt(num))+1; i++) {
                if (num % i == 0) 
                    return false;
            }
        }
        return true;
    }
    
    
    // 진법 변환 함수
    public String convert(int n, int k) {
        String str = "";
        while (n > 0) {
            str = String.valueOf(n % k) + str;
            n = n / k;
        }
        return str;
    }
    
}
