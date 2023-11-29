// https://school.programmers.co.kr/learn/courses/30/lessons/17681

// 개선 풀이
import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
    
        String[] array1 = convertArr(n, arr1);
        String[] array2 = convertArr(n, arr2);
        
        for (int i=0; i < n; i++) {
            String str = "";
            for (int j=0; j < n; j++) {
                if ((array1[i].charAt(j) == '0') && (array2[i].charAt(j) == '0')) {
                    str += " ";
                } else {
                    str += "#";
                }
            }
            answer[i] = str;
        }
        
        return answer;
    }  
    public String[] convertArr(int n, int[] arr) {
        
        String[] array = new String[n];
        
        for (int i=0; i < n; i++) {
            String str = Integer.toBinaryString(arr[i]);
            String zero = "";
            if (str.length() < n) {
                for (int j=0; j < n - str.length(); j++) {
                    zero += "0";
                }
            }
            str = zero + str;
            array[i] = str;
        }
        return array;
    }
}


/////////////////////////////////////////////////////////////////////////
// 직접 해결한 풀이
import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        List<String> result = new ArrayList<>();
        
        for (int a : arr1) {
            String str = Integer.toBinaryString(a);
            String zero = "";
            if (str.length() < n) {
                for(int i=0; i<n-str.length(); i++) {
                    zero += "0";
                }
            }
            list1.add(zero + str);
        }
        
        for (int a : arr2) {
            String str = Integer.toBinaryString(a);
            String zero = "";
            if (str.length() < n) {
                for(int i=0; i<n-str.length(); i++) {
                    zero += "0";
                }
            }
            list2.add(zero + str);
        }
 
        
        for (int i=0; i<n; i++) {
            String temp = "";
            for (int j=0; j<n; j++) {
                if ((list1.get(i).charAt(j) == '0') && (list2.get(i).charAt(j)) == '0') {
                    temp += " ";
                } else {
                    temp += "#";
                }
            }
            result.add(temp);
        }
        
        for (int i=0; i<n; i++) {
            answer[i] = result.get(i);
        }
        
        
        return answer;
    }
}
