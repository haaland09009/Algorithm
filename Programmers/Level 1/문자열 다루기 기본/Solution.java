// https://school.programmers.co.kr/learn/courses/30/lessons/12918
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                answer = false;
                break;
            }
        }
        
        if (s.length() != 4 && s.length() != 6) 
            answer = false;
        
        return answer;
    }
}
