// https://school.programmers.co.kr/learn/courses/30/lessons/12918%EF%BB%BF
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
         
        if ((length != 4) && (length != 6)) {
            answer = false;
        }
        
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                answer = false;
                break;
            }
        }
        
        
        return answer;
    }
}
