// https://school.programmers.co.kr/learn/courses/30/lessons/12948
// 1. 더 빠른 코드
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int length = phone_number.length();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<length-4; i++) {
            sb.append('*');
        }
        
        for(int i=length-4; i<=length-1; i++) {
            sb.append(phone_number.charAt(i));
        }
   
        return sb.toString();
    }
}

////////////////////////////////////////////////
// 2.
// class Solution {
//     public String solution(String phone_number) {
//         String answer = "";
        
//         char[] ch = phone_number.toCharArray();
//         for(int i=0; i<ch.length-4; i++) {
//             ch[i] = '*';
//         }
        
//         return String.valueOf(ch);
//     }
// }
