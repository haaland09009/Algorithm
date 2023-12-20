// https://school.programmers.co.kr/learn/courses/30/lessons/42885
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int start = 0; int end = people.length-1;
        
        while (start < end) {
            if (people[start] + people[end] <= limit) {
                answer += 1;
                start += 1;
            }
            end -= 1;
        }
        
        
        return people.length - answer;
    }
}
