// https://school.programmers.co.kr/learn/courses/30/lessons/161990
import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        
        for (int i=0; i<wallpaper.length; i++) {
            for (int j=0; j<wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    top = Math.min(i, top);
                    left = Math.min(j, left);
                    bottom = Math.max(i+1, bottom);
                    right = Math.max(j+1, right);
                }
            }
        }
        
        return new int[]{top, left, bottom, right};
    }
}



// import java.util.*;
// class Solution {
//     public int[] solution(String[] wallpaper) {
//         int[] answer = new int[4];
                
//         int min_x = wallpaper.length;   
//         int max_x = 0;
//         int min_y = wallpaper[0].length()-1;  
//         int max_y = 0;
        
//         for (int i=0; i<wallpaper.length; i++) {
//             for (int j=0; j<wallpaper[i].length(); j++) {
//                 if (wallpaper[i].charAt(j) == '#') {
//                     min_x = Math.min(min_x, i);
//                     max_x = Math.max(max_x, i+1);
//                     min_y = Math.min(min_y, j);
//                     max_y = Math.max(max_y, j+1);
//                 }
//             }
//         }
        
//         answer[0] = min_x; 
//         answer[1] = min_y;
//         answer[2] = max_x; 
//         answer[3] = max_y;
//         return answer;
//     }
// }
