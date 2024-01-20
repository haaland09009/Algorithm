// https://school.programmers.co.kr/learn/courses/30/lessons/12977
class Solution {
    static boolean[] visited;
    static int[] arr;
    static int n;
    static int answer;
    public int solution(int[] nums) {
        
        n = nums.length;
        visited = new boolean[nums.length];
        arr = new int[3];
        
        dfs(0, 0, nums);
        return answer;
    }
    
    private void dfs(int start, int depth, int[] nums) {
        if (depth == 3) {
            int sum = 0;
            for (int val : arr) {
                sum += val;
            }
            if (isPrimeNumber(sum))
                answer++;
            return;
        }
        for (int i=start; i<n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = nums[i];
                dfs(i, depth+1, nums);
                visited[i] = false;
            }
        }
    }
    
    
    private boolean isPrimeNumber(int number) {
        if (number <= 1) 
            return false;
        for (int i=2; i< ((int) Math.sqrt(number)) + 1; i++) {
            if (number % i == 0) 
                return false;
        }
        return true;
    }
}
