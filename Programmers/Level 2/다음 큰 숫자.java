# https://school.programmers.co.kr/learn/courses/30/lessons/12911
----------------------------------------------------------------------
# 1.

import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count = 0;
        String tmp = Integer.toBinaryString(n);
        for(int i=0; i<tmp.length(); i++) {
            if (tmp.charAt(i) == '1') {
                count++;
            }
        }
        
        String tmp_compare;
        int count_compare = 0;
        while (true) {
            n++;
            tmp_compare = Integer.toBinaryString(n);
            for (int i=0; i<tmp_compare.length(); i++) {
                if (tmp_compare.charAt(i) == '1') {
                    count_compare++;
                }
            }
            if (count == count_compare) {
                answer = n;
                break;
            }
            count_compare = 0;
            
        }
  
        return answer;
    }
}    
    

--------------------------------------------------------------------------
# 2. 더 빠른 코드

import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int bitCount = Integer.bitCount(n);
        
        while (true) {
            n++;
            if (bitCount == Integer.bitCount(n)) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}
