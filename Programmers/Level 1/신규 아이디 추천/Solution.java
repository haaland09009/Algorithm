// https://school.programmers.co.kr/learn/courses/30/lessons/72410
import java.util.*;
class Solution {
    public String solution(String new_id) {

        // 1단계 : 소문자로 치환
        new_id = new_id.toLowerCase();

        // 2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        String banWord = "~!@#$%^&*()=+[{]}:?,<>/";
        for (int i=0; i<banWord.length(); i++) {
            new_id = new_id.replace(banWord.substring(i, i+1), "");
        }
 
        // 3단계 : 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        int count = 0;
        StringBuilder sb = new StringBuilder();
    
        for (int i=0; i<new_id.length(); i++) {
            if (new_id.charAt(i) == '.') {
                count++;
            } else {
                if (count >= 1) {
                    sb.append(".");
                    count = 0;
                }
            }
            if (new_id.charAt(i) != '.')
                sb.append(new_id.substring(i, i+1));
            if (i == new_id.length()-1 && count >= 1) 
                sb.append(".");
        }

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        String temp = sb.toString();
        StringBuilder sb1 = new StringBuilder();        
        for (int i=0; i<temp.length(); i++) {
            if ((i == 0 && temp.charAt(i) == '.') || (i == temp.length()-1 && temp.charAt(i) == '.')) 
                sb1.append("");
            else {
                sb1.append(temp.substring(i, i+1));
            }
        }
        

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        String word = sb1.toString();
        if (word.length() == 0) 
            word += "a";
   
        //  6단계 
        if (word.length() >= 16) 
            word = word.substring(0, 15);
        if (word.substring(word.length()-1, word.length()).equals(".")) 
            word = word.substring(0, word.length()-1);
        
        // 7단계
        if (word.length() <= 2) {
            String finalWord = word.substring(word.length()-1, word.length());
            while (word.length() <= 2) {
                word += finalWord;
            }
        }
  
        return word.toString();
    }
}
