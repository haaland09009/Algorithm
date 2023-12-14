// https://school.programmers.co.kr/learn/courses/30/lessons/12951
class Solution {
    public String solution(String s) {

        s = s.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (int i=0; i<s.length(); i++) {
            String word = s.substring(i, i+1);
            if (word.equals(" ")) {
                idx = 0;
                sb.append(word);
            } else {
                if (idx == 0) 
                    sb.append(word.toUpperCase());
                else 
                    sb.append(word);
                idx++;
            }
        }
        
        return sb.toString();
    }
}
