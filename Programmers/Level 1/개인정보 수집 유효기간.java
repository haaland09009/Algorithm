// 처음 해결한 풀이
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        // 오늘 날짜 구하기
        int toYear = Integer.parseInt(today.split("\\.")[0]);
        int toMonth = Integer.parseInt(today.split("\\.")[1]);
        int toDay = Integer.parseInt(today.split("\\.")[2]);
        
        int result = 0;
        result += (toYear-1) * 28 * 12;
        for (int i=1; i<toMonth; i++) {
            result += 28;
        }
        result += toDay;
    
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<terms.length; i++) {
            int period = Integer.parseInt(terms[i].split(" ")[1]);
            map.put(terms[i].split(" ")[0], period);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<privacies.length; i++) {
            String m = privacies[i].split(" ")[0];
            String p = privacies[i].split(" ")[1];
            int d = map.get(p);
            
            int year = Integer.parseInt(m.split("\\.")[0]);
            int month = Integer.parseInt(m.split("\\.")[1]);
            int day = Integer.parseInt(m.split("\\.")[2]);   
  
            int total = (year-1) * 28 * 12;
            for (int j=1; j<month; j++) 
                total += 28;
            total += day; 

            for (int k=1; k<=d; k++)
                total += 28;

            if (total <= result)
                list.add(i+1);
        }
      
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
   
        return answer;
    }
}
