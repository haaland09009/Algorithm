// https://school.programmers.co.kr/learn/courses/30/lessons/92341
import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        
        Map<String, List<String>> map = new HashMap<>();
        for (String r : records) {
            String time = r.split(" ")[0]; String car = r.split(" ")[1];
            if (!map.containsKey(car)) {
                List<String> list = new ArrayList<>();
                list.add(time);
                map.put(car, list);
            } else {
                map.get(car).add(time);
            }
        }
        
        // 입차된 이후에 출차된 내역이 없을 경우 23:59에 출차된 것으로 간주한다.
        for (String key : map.keySet()) {
            if (map.get(key).size() % 2 != 0) {
                map.get(key).add("23:59");
            }
        }     
        
        Map<String, Integer> result = new HashMap<>();
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            int inTime = 0;  int outTime = 0;
            // total_fees : 총 요금
            int total_fees = 0; 
            for (int i=0; i<list.size(); i+=2) {
                String outHour = list.get(i+1).split(":")[0];
                String outMinute = list.get(i+1).split(":")[1];
                String inHour = list.get(i).split(":")[0];
                String inMinute = list.get(i).split(":")[1];
                
                outTime += Integer.parseInt(outHour) * 60 + Integer.parseInt(outMinute);
                inTime += Integer.parseInt(inHour) * 60 + Integer.parseInt(inMinute);    
            }
            int time = outTime - inTime;
            if (time <= fees[0]) {
                total_fees = fees[1];
            } else {
                total_fees = fees[1] + (int) Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3];
            }
            result.put(key, total_fees);
        }
        
        
        List<String> carNumber = new ArrayList<>(map.keySet());
        Collections.sort(carNumber);
        
        answer = new int[carNumber.size()];
        for (int i=0; i<carNumber.size(); i++) {
            answer[i] = result.get(carNumber.get(i));
        }
          
        return answer;
    }
}
