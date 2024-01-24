// https://school.programmers.co.kr/learn/courses/30/lessons/12930
class Solution {
    public String solution(String s) { 
        String answer = "";
        
        String[] arr = s.split("");
        int idx = 0;
        
        for(int i=0; i<arr.length; i++) {
            if (arr[i].equals(" ")) {
                idx = 0;
            } else if (idx % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                idx++;
            } else {
                arr[i] = arr[i].toLowerCase();
                idx++;
            }
            answer += arr[i];
        }   
        return answer;
    }
}


// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         int idx = 0;
//         for (int i=0; i<s.length(); i++) {
//             if (s.substring(i, i+1).equals(" ")) {
//                 idx = 0;
//                 answer += " ";
//             } else {
//                 if (idx % 2 == 0) {
//                     answer += s.substring(i, i+1).toUpperCase();
//                 } else {
//                     answer += s.substring(i, i+1).toLowerCase();
//                 }
//                 idx++;
//             }
            
//         }
//         return answer;
//     }
// }
