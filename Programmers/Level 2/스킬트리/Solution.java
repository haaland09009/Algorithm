// https://school.programmers.co.kr/learn/courses/30/lessons/49993
import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String[] skill_list = skill.split("");
        
        for (String skill_tree : skill_trees) {
            boolean result = true;
            List<String> list = new ArrayList<>();
            for (String s : skill_list) {
                list.add(s);
            }
            
            for (int i=0; i<skill_tree.length(); i++) {
                String sk = skill_tree.substring(i, i+1);
                if (skill.contains(sk) && !sk.equals(list.get(0))) {
                    result = false;
                    break;
                } else if (skill.contains(sk) && sk.equals(list.get(0))) {
                    list.remove(0);
                }
            }
            
            if (result)
                answer++;
        }
        
        return answer;
    }
}
