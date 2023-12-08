// https://school.programmers.co.kr/learn/courses/30/lessons/42862
import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Set<Integer> lost_people = new HashSet<>();
        Set<Integer> reserve_people = new HashSet<>();
        
        for (int r : reserve) 
            reserve_people.add(r);
        
        for (int l : lost) {
            if (reserve_people.contains(l)) {
                reserve_people.remove(l);
            } else {
                lost_people.add(l);
            }
        }
        
        for (int r : reserve_people) {
            if (lost_people.contains(r-1)) {
                lost_people.remove(r-1);
            } else if (lost_people.contains(r+1)) {
                lost_people.remove(r+1);
            }
        }
        
        
        
        return n - lost_people.size();
    }
}
