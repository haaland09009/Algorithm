// https://school.programmers.co.kr/learn/courses/30/lessons/178870
import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        // 시작 지점과 끝 지점
        int start = 0;
        int end = 0;
        
        int sum = sequence[end];
        int length = 1000001;
        
        // 결과를 저장할 인덱스
        int leftIdx = 0; 
        int rightIdx = 0;

        while (true) {
            if (sum < k) {
                if (end + 1 == sequence.length) 
                    break;
                end++;
                sum += sequence[end];
            } else if (sum > k) {
                sum -= sequence[start];
                start++;
            } else {
                int diff = end - start;
                if (diff < length) {
                    length = diff;
                    leftIdx = start;
                    rightIdx = end;
                }
                sum -= sequence[start];
                start++;
            }
        }
        

        answer[0] = leftIdx;
        answer[1] = rightIdx;
        return answer;
    }
}
