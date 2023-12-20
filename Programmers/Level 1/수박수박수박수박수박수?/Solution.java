// https://school.programmers.co.kr/learn/courses/30/lessons/12922%EF%BB%BF
class Solution {
    public String solution(int n) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append("수박");
        }

        return sb.substring(0, n);
    }
}
