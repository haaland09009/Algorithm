// https://school.programmers.co.kr/learn/courses/30/lessons/17686
import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        
        List<ArrayList<String>> list = new ArrayList<>();
        for (String file : files) {
            String head = ""; String number = ""; String tail = "";
            for (int i=0; i<file.length(); i++) {
                if (Character.isDigit(file.charAt(i))) {
                    head = file.substring(0, i);
                    number = file.substring(i);
                    break;
                }
            }
            for (int i=0; i<number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    tail = number.substring(i);
                    number = number.substring(0, i);
                    break;
                }
            }
            ArrayList<String> tmp = new ArrayList<>();
            tmp.add(head); tmp.add(number); tmp.add(tail);
            list.add(tmp);
        }
        
        list.sort((o1,o2) -> {
              int headCompare = o1.get(0).toLowerCase().compareTo(o2.get(0).toLowerCase());
              if (headCompare != 0) {
                  return headCompare;
              }

              int num1 = Integer.parseInt(o1.get(1));
              int num2 = Integer.parseInt(o2.get(1));
              return Integer.compare(num1, num2);
                 
        });
        
        answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            ArrayList<String> tmp = list.get(i);
            answer[i] = tmp.get(0) + tmp.get(1) + tmp.get(2);
        }
        
        return answer;
    }
}
