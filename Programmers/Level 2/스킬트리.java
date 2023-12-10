// 처음 해결한 풀이
import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String[] skill_list = skill.split("");

        for (int i=0; i<skill_trees.length; i++) {
            List<String> list = new ArrayList<>();
            for (String s : skill_list) {
                list.add(s);
            }
            boolean result = true;
            for (int j=0; j<skill_trees[i].length(); j++) {
                String ch = skill_trees[i].substring(j, j+1);
                if (skill.contains(ch) && !ch.equals(list.get(0))) {
                    result = false;
                    break;
                } else if (skill.contains(ch) && ch.equals(list.get(0))) {
                    list.remove(0);
                }
            }
            if (result) 
                answer++;
        }
        
        
        return answer;
    }
}
