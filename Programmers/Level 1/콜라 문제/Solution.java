// https://school.programmers.co.kr/learn/courses/30/lessons/132267#
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;  
        int count = 0;
        
        while (n >= a) {
            count = (n / a) * b; // 받는 병의 수
            n = count + (n % a); // 받는 병의 수 + 나머지 병의 수 = 현재 보유한 병의 수
            answer += count; 
        }
        
        return answer;
    }
}
