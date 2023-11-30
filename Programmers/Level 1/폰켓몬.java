// https://school.programmers.co.kr/learn/courses/30/lessons/1845
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        
        if (nums.length / 2 < set.size()) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }

        return answer;
    }
}
