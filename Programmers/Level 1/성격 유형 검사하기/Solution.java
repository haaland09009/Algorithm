// https://school.programmers.co.kr/learn/courses/30/lessons/118666
import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        int[] score = {3,2,1,0,1,2,3};
        
        char[][] charArr = {{'R','T'}, {'C','F'},{'J','M'},{'A','N'}};
        Map<Character, Integer> map = new HashMap<>();
        for (char[] c : charArr) {
            map.put(c[0], 0);
            map.put(c[1], 0);
        }
        
        for (int i=0; i<choices.length; i++) {
            if (choices[i] >= 5) {
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + score[choices[i]-1]);
            } else {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + score[choices[i]-1]);
            }
        }
        
        
        for (int i=0; i<charArr.length; i++) {
            if (map.get(charArr[i][0]) < map.get(charArr[i][1])) {
                answer += charArr[i][1];
            } else {
                answer += charArr[i][0];
            }
        }
        

        return answer;
    }
}
