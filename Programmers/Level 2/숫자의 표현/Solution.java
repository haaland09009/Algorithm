// https://school.programmers.co.kr/learn/courses/30/lessons/12924
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int temp;
        for(int i=1; i<=n; i++) {
            temp = 0;
            for(int j=i; j<=n; j++) {
                temp += j;
                if (temp == n) {
                    answer++;
                    break;
                } else if (temp > n) {
                    break;
                }
            }
        }
        return answer;
    }
}
