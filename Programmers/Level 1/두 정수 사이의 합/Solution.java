// https://school.programmers.co.kr/learn/courses/30/lessons/12912
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int left = a <= b ? a : b;
        int right = (left == a) ? b : a;
        
        for (int i=left; i<=right; i++) {
            answer += i;
        }
        

        return answer;
    }
}
