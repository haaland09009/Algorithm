// https://school.programmers.co.kr/learn/courses/30/lessons/147355
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int length = p.length();
        Long number = Long.parseLong(p);
        
        for (int i=0; i<=t.length()-length; i++) {
            String str = t.substring(i, i+length);
            if (Long.parseLong(str) <= number)
                answer++;
        }
        
        return answer;
    }
}
