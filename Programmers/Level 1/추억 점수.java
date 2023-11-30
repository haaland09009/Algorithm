// https://school.programmers.co.kr/learn/courses/30/lessons/176963
import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        
        // 인물의 그리움 점수를 모두 합산한 값 =  해당 사진의 추억 점수
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
  
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<photo.length; i++) {
            int score = 0;
            for (int j=0; j<photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    score += map.get(photo[i][j]);
                } 
            }
            list.add(score);
        }
      
       answer = new int[list.size()];
       for (int i=0; i<list.size(); i++) {
           answer[i] = list.get(i);
       } 
        
        return answer;
    }
}
