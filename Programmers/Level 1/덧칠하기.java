// https://school.programmers.co.kr/learn/courses/30/lessons/161989
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 처음 페인트를 칠해야 하는 구역을 index로 설정
        int idx = 0;

        // 요소가 현재 idx 보다 크다면 아직 칠하지 않은 것이므로 1 증가시키기      
        for (int s : section) {
            if (s > idx) {
                answer++;
                idx = s + m - 1; 
            } 
        }
        
        return answer;
    }
}
