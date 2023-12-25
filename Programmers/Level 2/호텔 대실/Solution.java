// https://school.programmers.co.kr/learn/courses/30/lessons/155651
import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i<book_time.length; i++) {
            String s = book_time[i][0];
            String e = book_time[i][1];
            
            int start = Integer.parseInt(s.split(":")[0]) * 60 + Integer.parseInt(s.split(":")[1]);
            int end = Integer.parseInt(e.split(":")[0]) * 60 + Integer.parseInt(e.split(":")[1]) + 10;
            
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(start); tmp.add(end);
            list.add(tmp);
   
        }
        
        list.sort((o1, o2) -> o1.get(0).compareTo(o2.get(0)));
        
        Map<Integer, ArrayList<Integer>> rooms = new HashMap<>();
        int cnt = 0;
        for (int i=0; i<list.size(); i++) {
            if (rooms.size() == 0) {
                ArrayList<Integer> room = new ArrayList<>();
                room.add(list.get(i).get(1));
                cnt++;
                rooms.put(cnt, room);
                continue;
            }
            boolean isEnter = false;
            for (Integer key : rooms.keySet()) {
                if (list.get(i).get(0) >= rooms.get(key).get(rooms.get(key).size()-1)) {
                    rooms.get(key).add(list.get(i).get(1));
                    isEnter = true;
                    break;
                }
            }
            if (!isEnter) {
                ArrayList<Integer> room = new ArrayList<>();
                room.add(list.get(i).get(1));
                cnt++;
                rooms.put(cnt, room);                
            }
        }
        
        return rooms.size();
    }
}
