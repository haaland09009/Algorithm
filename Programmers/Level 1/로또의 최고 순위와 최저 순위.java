// https://school.programmers.co.kr/learn/courses/30/lessons/77484
import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // 등수(맞힌 수 0 1 2 3 4 5 6)
        int[] rank = {6,6,5,4,3,2,1};
        
        int minCount = 0; // 진짜 정답을 맞춘 로또의 개수만 측정
        int maxCount = 0; // 0도 당첨이라 가정하고 0의 개수 측정
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : win_nums) {
            map.put(num, 1);
        }
        
        for (int i=0; i<lottos.length; i++) {
            if (map.containsKey(lottos[i])) {
                minCount++;
            } else if (lottos[i] == 0) {
                maxCount++;
            }
        } 
        
        answer[0] = rank[minCount + maxCount]; // 최고 순위
        answer[1] = rank[minCount]; // 최저 순위

        return answer;
    }
}
