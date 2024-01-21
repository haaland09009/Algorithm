// https://school.programmers.co.kr/learn/courses/30/lessons/12940
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if (b % a == 0)
            return a;
        return gcd(b % a, a);
    }
    
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
}
