// https://school.programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] result = new int[3];
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                result[0]++;
            } if (answers[i] == student2[i % student2.length]) {
                result[1]++;
            } if (answers[i] == student3[i % student3.length]) {
                result[2]++;
            }
        }
    
        int maxScore = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<result.length; i++) {
            if (result[i] > maxScore) {
                maxScore = result[i];
            }
        }
        
        for (int i=0; i<result.length; i++) {
            if (result[i] == maxScore) {
                list.add(i+1);
            }
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
