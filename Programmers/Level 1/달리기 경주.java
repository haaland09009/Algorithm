// https://school.programmers.co.kr/learn/courses/30/lessons/178871
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String player : callings) {
            // 현재 선수의 등수 
            int rank = map.get(player);
            // 앞서 가던 선수의 이름
            String beforePlayer = players[rank-1];
            
            players[rank-1] = player;
            players[rank] = beforePlayer;
            
            map.put(player, rank-1);
            map.put(beforePlayer, rank);
        }
        
        return players;
    }
}


///////////////////////////////////////////////////////////////////////
// 직접 해결한 풀이 : 시간 오래 걸림, 메모리 ↑ (좋은 해결방법 x)
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(i, players[i]);
            map1.put(players[i], i);
        }

        for (String player : callings) {
            int rank = map1.get(player); // 부름 당한 선수의 원래 등수
            String athlete = map.get(rank-1); // 앞 등수에 있던 선수
            map.put(rank-1, player); map.put(rank, athlete);
            map1.put(player, rank-1); map1.put(athlete, rank);  
        }
  
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        answer = new String[keySet.size()];
        for (int i=0; i<keySet.size(); i++) {
            answer[i] = map.get(i);
        }
        
        
        return answer;
    }
}
