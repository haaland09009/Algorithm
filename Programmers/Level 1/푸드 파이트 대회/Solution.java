// https://school.programmers.co.kr/learn/courses/30/lessons/134240
// 처음 해결한 풀이
class Solution {
    public String solution(int[] food) {
        
        String tmp = "";
        String tmp1 = "";
        
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                tmp += String.valueOf(i);
            }
        }
        tmp += "0";
        
        for(int i=tmp.length()-2; i>=0; i--) {
            tmp1 += tmp.charAt(i); 
        }
        
        
        return tmp + tmp1;
    }
}

///////////////////////////////////////////////////////////////
// 개선 풀이
class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }
        
        answer = sb.toString() + "0";
        
        return answer + sb.reverse();
    }
}
