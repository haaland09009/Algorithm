// https://school.programmers.co.kr/learn/courses/30/lessons/64065
import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
         
        s = s.substring(2, s.length()-2);
        String[] arr = s.split("},\\{");
        
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, ArrayList<String>> map1 = new HashMap<>();
        
        for (int i=0; i<arr.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            String[] tmpArr = arr[i].split("\\,");
            for (String a : tmpArr) {
                list.add(a);
            }
            map.put(i, tmpArr.length);
            map1.put(i, list);
        }

        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1,o2) -> map.get(o1) - map.get(o2));
        
        List<String> result = new ArrayList<>();
        for (int key : keySet) {
            for (String str : map1.get(key)) {
                if (!result.contains(str))
                    result.add(str);
            }
        }
        
        answer = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            answer[i] = Integer.parseInt(result.get(i));
        }
        return answer;
    }
}
