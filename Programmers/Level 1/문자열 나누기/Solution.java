// https://school.programmers.co.kr/learn/courses/30/lessons/140108
class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        
        int firstCnt = 0;
        int diffCnt = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (firstCnt == diffCnt) {
                answer++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) {
                firstCnt++;
            } else {
                diffCnt++;
            }
        }
        return answer;
    }
}
