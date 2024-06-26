// https://school.programmers.co.kr/learn/courses/30/lessons/160586
import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<keymap.length; i++) {
            for (int j=0; j<keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if (!map.containsKey(c)) {
                    map.put(c, j+1);
                } else {
                    map.put(c, Math.min(map.get(c), j+1));
                }
            }
        }
   
        for (int i=0; i<targets.length; i++) {
            int count = 0;
            for (int j=0; j<targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if (map.containsKey(c)) {
                    count += map.get(c);
                } else {
                    count = -1;
                    break;
                }       
            }
            answer[i] = count;
        }
 
        return answer;
    }
}




/*
import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (String key : keymap) {
           for (int i=0; i<key.length(); i++) {
               char c = key.charAt(i);
               if (map.get(c) != null && i+1 < map.get(c)) {
                   map.put(c, Math.min(i+1, map.get(c)));
               } else if (map.get(c) == null) {
                   map.put(key.charAt(i), i + 1);
               }
           }
        }
        
    
        for (int i=0; i<targets.length; i++) {
            int count = 0;
            for (int j=0; j<targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if (map.get(c) != null) {
                    count += map.get(c);
                } else {
                    count = -1;
                    break;
                }
            }
            answer[i] = count;
        }

        
        return answer;
    }
}
*/
