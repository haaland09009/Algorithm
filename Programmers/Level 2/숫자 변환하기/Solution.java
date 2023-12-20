// https://school.programmers.co.kr/learn/courses/30/lessons/154538
import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        int[] dp = new int[1000001];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(x);
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num == y) 
                return dp[num];
            int[] arr = {num + n, num * 2, num * 3};
            for (int a : arr) {
                if (a >= 0 && a < 1000001 && dp[a] == 0) {
                    dp[a] = dp[num] + 1;
                    queue.add(a);
                }
            }
        }
        
        return -1;
    }
}
