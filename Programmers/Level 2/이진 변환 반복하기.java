// https://school.programmers.co.kr/learn/courses/30/lessons/70129
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
 
        while (!s.equals("1")) {
            int cnt = 0;
            for (int i=0; i<s.length(); i++) {
                if (s.substring(i, i+1).equals("1"))
                    cnt++;
            }
            answer[1] += s.length() - cnt;
            answer[0]++;
            s = Integer.toBinaryString(cnt);
        }
        
        
        return answer;
    }
}
