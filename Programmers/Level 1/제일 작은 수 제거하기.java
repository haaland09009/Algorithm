// https://school.programmers.co.kr/learn/courses/30/lessons/12935

// 1. 더 빠른 코드
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            List<Integer> list = new ArrayList<>(); 
            for(int a : arr) {
                list.add(a);
            }
            
            Integer minValue = Collections.min(list);
            list.remove(minValue);
            
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }

        }
        
        return answer;
    }
}

/////////////////////////////////////////////////////////
// 2. 직접 해결한 풀이
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int[] tmp = Arrays.copyOfRange(arr, 0, arr.length);
        
        List<Integer> list = new ArrayList<>();
        Arrays.sort(tmp);
        int min_value = tmp[0];
        
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
           for(int i=0; i<arr.length; i++) {
               if (arr[i] != min_value) {
                   list.add(arr[i]);
               }
           }
           answer = new int[list.size()];
           for(int i=0; i<list.size(); i++) {
               answer[i] = list.get(i);
           } 
        }

        return answer;
    }
}
