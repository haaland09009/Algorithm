// https://school.programmers.co.kr/learn/courses/30/lessons/92334
import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 회원 : 회원이 신고한 유저 목록을 담을 map
        Map<String, List<String>> map = new HashMap<>();
      
        for (String r : report) {
            String reporter = r.split(" ")[0];  // 신고한 사람
            String reported = r.split(" ")[1]; // 신고당한 사람
            if (!map.containsKey(reporter)) {
                List<String> list = new ArrayList<>();
                list.add(reported);
                map.put(reporter, list);
            } else {
                if (!map.get(reporter).contains(reported)) {
                    map.get(reporter).add(reported);
                }
            }
        }
        
        // 앞서 구한 map을 바탕으로 각 회원 당 신고당한 횟수 구하기
        Map<String, Integer> map1 = new HashMap<>();
        for (String key : map.keySet()) {
            for (String user : map.get(key)) {
                map1.put(user, map1.getOrDefault(user, 0) + 1);
            }
        }
        
        // 정지된 아이디 목록
        List<String> reported_user_list = new ArrayList<>();
        
        for (String key : map1.keySet()) {
            if (map1.get(key) >= k) {
                reported_user_list.add(key);
            }
        }
        
        for (int i=0; i<id_list.length; i++) {
            if (map.containsKey(id_list[i])) {
                for (String user : map.get(id_list[i])) {
                    if (reported_user_list.contains(user)) {
                        answer[i]++;
                    }
                }
            }
            
        }
        
        return answer;
    }
}
