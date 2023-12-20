// https://school.programmers.co.kr/learn/courses/30/lessons/64061
import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int move : moves) {
            for (int i=0; i<board.length; i++) {
                if (board[i][move-1] != 0) {
                    stack.push(board[i][move-1]);
                    board[i][move-1] = 0;
                    break;
                }
            }

            if (stack.size() >= 2 && stack.get(stack.size()-1) == stack.get(stack.size()-2)) {
                stack.pop();
                stack.pop();
                answer += 2;
            }
        }

        return answer;
    }
}
