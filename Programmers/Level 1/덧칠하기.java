// https://school.programmers.co.kr/learn/courses/30/lessons/161989
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int prev = section[0];
        
        for (int sec : section) {
            if (sec - prev >= m) {
                answer++;
                prev = sec;
            } 
        }
        
        
        return answer;
    }
}
