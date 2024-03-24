// https://school.programmers.co.kr/learn/courses/30/lessons/12945
class Solution {
    public int solution(int n) {
        
        int[] f = new int[100001];
        
        f[1] = 1;
        
        for (int i=2; i<=n; i++) {
            f[i] = (f[i-1] + f[i-2]) % 1234567;
        }
        
        return f[n];
    }
}
