// https://school.programmers.co.kr/learn/courses/30/lessons/140108
class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        
        int firstCnt = 0;
        int diffCnt = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (firstCnt == diffCnt) {
                answer++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) {
                firstCnt++;
            } else {
                diffCnt++;
            }
        }
        return answer;
    }
}


// class Solution {
//     public int solution(String s) {
//         int answer = 0;
        
//         char firstWord = s.charAt(0);
//         int cnt = 0;
//         int remain_cnt = 0;
//         for (int i=0; i<s.length(); i++) {
//             if (s.charAt(i) == firstWord) {
//                 cnt++;
//             } else {
//                 remain_cnt++;
//             }
//             if (cnt == remain_cnt) {
//                 answer++;
//                 if (i < s.length() - 1) {
//                     firstWord = s.charAt(i+1);
//                 }
//                 cnt = 0;
//                 remain_cnt = 0;                
//             }
//         }
        
//         if (cnt > 0) {
//             answer++;
//         }
        
      
        
//         return answer;
//     }
// }
