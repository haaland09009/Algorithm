// https://school.programmers.co.kr/learn/courses/30/lessons/155652
class Solution {
    public String solution(String s, String skip, int index) {
        
        String word = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<skip.length(); i++) {
            word = word.replace(skip.substring(i, i+1), "");
        }
        
        for (int i=0; i<s.length(); i++) {
            int idx = (word.indexOf(s.charAt(i)) + index) % word.length();
            sb.append(word.substring(idx, idx+1));
        }
        
        return sb.toString();
    }
}
