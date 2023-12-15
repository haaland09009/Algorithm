// https://school.programmers.co.kr/learn/courses/30/lessons/42888
import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        
        Map<String, String> map = new HashMap<>();
        for (String r : record) {
            String action = r.split(" ")[0];
            String userId = r.split(" ")[1];   
            if (action.equals("Enter")) {
                map.put(userId, r.split(" ")[2]);
            } else if (action.equals("Change")) {
                map.put(userId, r.split(" ")[2]);
            }
        }
        
        List<String> list = new ArrayList<>();
        for (String r : record) {
            String action = r.split(" ")[0];
            String userId = r.split(" ")[1];   
            if (action.equals("Enter")) {
                list.add(map.get(userId) + "님이 들어왔습니다.");
            } else if (action.equals("Leave")) {                
                list.add(map.get(userId) + "님이 나갔습니다.");
            }
        }
        
        answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
