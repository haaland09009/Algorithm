// https://school.programmers.co.kr/learn/courses/30/lessons/67256
class Solution {
    int[][] pad = {
        {3, 1},
        {0, 0},
        {0, 1},
        {0, 2},
        {1, 0},
        {1, 1},
        {1, 2},
        {2, 0},
        {2, 1},
        {2, 2}
    };
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[] leftPos = {3, 0};
        int[] rightPos = {3, 2};
        
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                leftPos = pad[num];
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rightPos = pad[num];
            } else {
                if (getDist(leftPos, num) < getDist(rightPos, num)) {
                    answer += "L";
                    leftPos = pad[num];
                } else if (getDist(leftPos, num) > getDist(rightPos, num)) {
                    answer += "R";
                    rightPos = pad[num];
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        leftPos = pad[num];
                    } else {
                        answer += "R";
                        rightPos = pad[num];
                    }
                }
            }
        }
        
        return answer;
    }
    
    private int getDist(int[] pos, int num) {
        return Math.abs(pos[0] - pad[num][0]) + Math.abs(pos[1] - pad[num][1]);
    }
    
}

// import java.util.*;
// class Solution {
//     public String solution(int[] numbers, String hand) {
//         String answer = "";
        
//         Map<Integer, int[]> map = new HashMap<>();
//         map.put(0, new int[]{3, 1});
//         map.put(1, new int[]{0, 0}); map.put(2, new int[]{0, 1}); map.put(3, new int[]{0, 2});
//         map.put(4, new int[]{1, 0}); map.put(5, new int[]{1, 1}); map.put(6, new int[]{1, 2});
//         map.put(7, new int[]{2, 0}); map.put(8, new int[]{2, 1}); map.put(9, new int[]{2, 2});
//         map.put(10, new int[]{3, 0}); map.put(11, new int[]{3, 2});
        
//         int[] leftPos = map.get(10); // *
//         int[] rightPos = map.get(11); // #
//         // System.out.println(leftPos[0]);

//         for (int number : numbers) {
//             if (number == 1 || number == 4 || number == 7) {
//                 answer += "L";
//                 leftPos[0] = map.get(number)[0];
//                 leftPos[1] = map.get(number)[1];              
//             } else if (number == 3 || number == 6 || number == 9) {
//                 answer += "R";
//                 rightPos[0] = map.get(number)[0];
//                 rightPos[1] = map.get(number)[1];
//             } else {
//                 int[] curPos = map.get(number);
//                 int res = getDistance(leftPos, rightPos, curPos);
//                 if (res == 1) {
//                     rightPos[0] = map.get(number)[0];
//                     rightPos[1] = map.get(number)[1];
//                     answer += "R";
//                 } else if (res == -1) {
//                     leftPos[0] = map.get(number)[0];
//                     leftPos[1] = map.get(number)[1];
//                     answer += "L";
//                 } else {
//                     if (hand.equals("left")) {
//                         leftPos[0] = map.get(number)[0];
//                         leftPos[1] = map.get(number)[1];
//                         answer += "L";                        
//                     } else {
//                         rightPos[0] = map.get(number)[0];
//                         rightPos[1] = map.get(number)[1];
//                         answer += "R";
//                     }
//                 }
                
//             }
//         }
//         return answer;
//     }
    
//     private int getDistance(int[] leftPos, int[] rightPos, int[] curPos) {
//         int result = 0;
//         int leftDistance = Math.abs(curPos[0] - leftPos[0]) + Math.abs(curPos[1] - leftPos[1]);
//         int rightDistance = Math.abs(curPos[0] - rightPos[0]) + Math.abs(curPos[1] - rightPos[1]);
        
//         if (leftDistance > rightDistance) {
//             result = 1;
//         } else if (leftDistance < rightDistance) {
//             result = -1;
//         } else {
//             result = 0;
//         }
//         return result;
//     }
// }
