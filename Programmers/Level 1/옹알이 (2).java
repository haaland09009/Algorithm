// https://school.programmers.co.kr/learn/courses/30/lessons/133499
import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] word_list = {"aya","ye","woo","ma"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : word_list) {
            map.put(word, 1);
        }
        
        for (String word : babbling) {
            String str = "";
            Stack<String> stack = new Stack<>();
            int length = word.length();
            for (int i=0; i<word.length(); i++) {
                str += word.substring(i, i+1);
                if (map.containsKey(str)) {
                    if ((stack.size() == 0) || (stack.size() >= 1 && !str.equals(stack.get(stack.size()-1)))) {
                        stack.push(str);
                        length -= str.length();
                        str = "";                        
                    }
                }
            }
            if (length == 0) {
                answer++;
            }
        }
        
        
        return answer;
    }
}
