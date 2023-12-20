// https://school.programmers.co.kr/learn/courses/30/lessons/67256
import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10;
        int right = 12;
      
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                right = num;
            } else {
                if (num == 0) 
                    num = 11;
                int leftDist = Math.abs(num - left) / 3 + Math.abs(num - left) % 3;
                int rightDist = Math.abs(num - right) / 3 + Math.abs(num - right) % 3;
                
                if (leftDist < rightDist) {
                    answer += "L";
                    left = num;
                } else if (leftDist > rightDist) {
                    answer += "R";
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        left = num;
                    } else {
                        answer += "R";
                        right = num;
                    }
                }
            }
        }
    
        return answer;
    }
}




//////////////////////////////////////////////////////////////
// 다른 풀이
// import java.util.*;
// class Solution {
//     int[][] pad = {
//         {3,1}, // 0
//         {0,0}, // 1
//         {0,1},
//         {0,2},
//         {1,0},
//         {1,1},
//         {1,2},
//         {2,0},
//         {2,1},
//         {2,2} // 9
//      };
//     public String solution(int[] numbers, String hand) {
//         String answer = "";
        
//         int[] leftPos = {3,0};
//         int[] rightPos = {3,2};
        
//         for (int num : numbers) {
//             if (num == 1 || num == 4 || num == 7) {
//                 answer += "L";
//                 leftPos = pad[num];
//             } else if (num == 3 || num == 6 || num == 9) {
//                 answer += "R";
//                 rightPos = pad[num];
//             } else {
//                 if (getDist(leftPos, num) < getDist(rightPos, num)) {
//                     answer += "L";
//                     leftPos = pad[num];
//                 } else if (getDist(leftPos, num) > getDist(rightPos, num)) {
//                     answer += "R";
//                     rightPos = pad[num];
//                 } else {
//                     if (hand.equals("left")) {
//                         answer += "L";
//                         leftPos = pad[num];                        
//                     } else {
//                         answer += "R";
//                         rightPos = pad[num];                        
//                     }
//                 }
//             }
//         }
        
//         return answer;
//     }
//     private int getDist(int[] pos, int num) {
//         return Math.abs(pos[0] - pad[num][0]) + Math.abs(pos[1] - pad[num][1]);
//     }
// }
