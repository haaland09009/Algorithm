// https://school.programmers.co.kr/learn/courses/30/lessons/12901
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] weeks = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int count = 0;
        for (int i=0; i<a-1; i++) {
            count += days[i];
        }
        count += b-1;
        answer = weeks[count % weeks.length];
        
        return answer;
    }
}
