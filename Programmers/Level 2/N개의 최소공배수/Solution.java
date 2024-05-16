// https://school.programmers.co.kr/learn/courses/30/lessons/12953
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        for (int i=1; i<arr.length; i++) {
            arr[i] = lcm(arr[i], arr[i-1]);
        }
        return arr[arr.length-1];
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
