// https://school.programmers.co.kr/learn/courses/30/lessons/77885
// 수정한 코드 (더 빠름)
import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            char[] binNumber = ("0" + Long.toBinaryString(numbers[i])).toCharArray();
            int idx = new String(binNumber).lastIndexOf('0');
            binNumber[idx] = '1';

            if (numbers[i] % 2 == 1) {
                binNumber[idx + 1] = '0';
            }

            answer[i] = Long.parseLong(new String(binNumber), 2);
        }

        return answer;
    }
}


// 직접 해결한 풀이
// https://school.programmers.co.kr/learn/courses/30/lessons/77885
// import java.util.*;
// class Solution {
//     public long[] solution(long[] numbers) {
//         long[] answer = new long[numbers.length];
      
//         for (int i=0; i<numbers.length; i++) {
//             String str = "0" + Long.toBinaryString(numbers[i]);
//             String[] arr = str.split("");
//             if (numbers[i] % 2 == 0) { 
//                 arr[arr.length-1] = "1";
//             } else {
//                 int idx = str.lastIndexOf("0");
//                 arr[idx] = "1";
//                 arr[idx + 1] = "0";                
//             }
//             StringBuilder sb = new StringBuilder();
//             for (int k=0; k<arr.length; k++) 
//                 sb.append(arr[k]);
//             answer[i] = Long.parseLong(sb.toString(), 2);
//         }
        

//         return answer;
//     }
// }
