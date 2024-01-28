// https://school.programmers.co.kr/learn/courses/30/lessons/136798
class Solution {

    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}




// import java.util.*;
// class Solution {
//     public int solution(int number, int limit, int power) {
//         int answer = 0;
        
//         for (int i=1; i<=number; i++) {
//             answer += getCountDivisor(i, limit, power);
//         }
        
//         return answer;
//     }
    
    
//     public int getCountDivisor(int number, int limit, int power) {
        
//         int count = 0;
//         for (int i=1; i<(int)(Math.sqrt(number))+1; i++) {
//             if (number % i == 0) {
//                 if (i == number / i) {
//                     count += 1;
//                 } else {
//                     count += 2;
//                 }
//             } 
//         }
//         if (count > limit) 
//             return power;
//         return count;
//     }
    
// }
