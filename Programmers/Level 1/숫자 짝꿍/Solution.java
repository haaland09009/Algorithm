// https://school.programmers.co.kr/learn/courses/30/lessons/131128
import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();
        
        for (int i=0; i<X.length(); i++) {
            Integer num = Integer.parseInt(X.substring(i, i+1));
            mapX.put(num, mapX.getOrDefault(num, 0) + 1);
        }
        for (int i=0; i<Y.length(); i++) {
            Integer num = Integer.parseInt(Y.substring(i, i+1));
            mapY.put(num, mapY.getOrDefault(num, 0) + 1);
        }            
        
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer key : mapY.keySet()) {
            if (mapX.containsKey(key)) {
                int value = Math.min(mapX.get(key), mapY.get(key));
                result.put(key, value);
            }
        }

        List<Integer> number = new ArrayList<>(result.keySet());
        Collections.sort(number);
        

        if (result.size() == 0) {
            answer = "-1";
        } else if (result.size() == 1 && result.containsKey(0)) {
            answer = "0";
        } else {
            for (int i=number.size()-1; i>=0; i--) {
                answer += String.valueOf(number.get(i)).repeat(result.get(number.get(i)));
            }
        }
 
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public String solution(String X, String Y) {
//         String answer = "";
        
//         Map<Integer, Integer> mapX = new HashMap<>();
//         Map<Integer, Integer> mapY = new HashMap<>();
        
//         for (int i=0; i<X.length(); i++) {
//             Integer num = X.charAt(i) - 48;
//             mapX.put(num, mapX.getOrDefault(num, 0) + 1);
//         }
//         for (int i=0; i<Y.length(); i++) {
//             Integer num = Y.charAt(i) - 48;
//             mapY.put(num, mapY.getOrDefault(num, 0) + 1);
//         }            
        
//         Map<Integer, Integer> result = new HashMap<>();
//         for (Integer key : mapY.keySet()) {
//             if (mapX.containsKey(key)) {
//                 int value = Math.min(mapX.get(key), mapY.get(key));
//                 result.put(key, value);
//             }
//         }

//         List<Integer> number = new ArrayList<>(result.keySet());
//         Collections.sort(number);
        

//         if (result.size() == 0) {
//             answer = "-1";
//         } else if (result.size() == 1 && result.containsKey(0)) {
//             answer = "0";
//         } else {
//             for (int i=number.size()-1; i>=0; i--) {
//                 answer += String.valueOf(number.get(i)).repeat(result.get(number.get(i)));
//             }
//         }
 
//         return answer;
//     }
// }
