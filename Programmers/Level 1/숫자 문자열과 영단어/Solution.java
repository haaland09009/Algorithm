// https://school.programmers.co.kr/learn/courses/30/lessons/81301
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i=0; i<arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}



// import java.util.*;
// class Solution {
//     public int solution(String s) {
     
//         Map<String, String> map = new HashMap<>();
//         map.put("zero", "0");
//         map.put("one", "1");
//         map.put("two", "2");
//         map.put("three", "3");
//         map.put("four", "4");
//         map.put("five", "5");
//         map.put("six", "6");
//         map.put("seven", "7");
//         map.put("eight", "8");
//         map.put("nine", "9");
        
//         String result = "";
//         String tmp = "";
//         for (int i=0; i<s.length(); i++) {
//             if (Character.isLetter(s.charAt(i))) {
//                 tmp += s.substring(i, i+1);
//                 if (map.containsKey(tmp)) {
//                     result += map.get(tmp);
//                     tmp = "";
//                 }
//             } else {
//                 result += String.valueOf(s.charAt(i));
//             }
//         }
        
  
//         return Integer.parseInt(result.toString());
//     }
// }
