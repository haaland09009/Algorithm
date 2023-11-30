// https://school.programmers.co.kr/learn/courses/30/lessons/12977
import java.util.*;
class Solution {
    public boolean[] visited;
    public int[] arr;
    public int sum;
    public int answer;
    
    public int solution(int[] nums) {
       
        visited = new boolean[nums.length];
        arr = new int[3];
        dfs(0, nums, 0);

        return answer;
    }
    
    public void dfs(int depth, int[] nums, int start) {
        if (depth == 3) {
            for (int a : arr) {
                sum += a;
            }
            if (isPrimeNumber(sum)) {
                answer++;
            }
            sum = 0;
            return;
        }
        for (int i=start; i<nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = nums[i];
                dfs(depth+1, nums, i);
                visited[i] = false;
            }
        }
    }
    
    
    public boolean isPrimeNumber(int n) {
        if (n <= 1) 
            return false;
        for (int i=2; i<(int)(Math.sqrt(n)) + 1; i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }
    
}
