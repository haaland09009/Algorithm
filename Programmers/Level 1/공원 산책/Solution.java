// https://school.programmers.co.kr/learn/courses/30/lessons/172928
import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        Map<String, int[]> map = new HashMap<>();
        map.put("N", new int[]{-1, 0}); 
        map.put("S", new int[]{1, 0});
        map.put("W", new int[]{0, -1});
        map.put("E", new int[]{0, 1});
        
        int m = park.length;
        int n = park[0].length();
           
        int cx = 0;
        int cy = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (park[i].charAt(j) == 'S') {
                    cx = i;
                    cy = j;
                    break;
                }
            }
        }
        
        for (int i=0; i<routes.length; i++) {
            String direction = routes[i].split(" ")[0];
            int count = Integer.parseInt(routes[i].split(" ")[1]);
            
            int nx = cx;
            int ny = cy;
            
            boolean flag = true;
            
            while (count > 0) {
                count--;
                nx += map.get(direction)[0];
                ny += map.get(direction)[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    flag = false;
                    break;
                }
                if (park[nx].charAt(ny) == 'X') {
                    flag = false;
                    break;
                }  
            }
            
            if (flag) {
                cx = nx;
                cy = ny;
            }
        }
        
        answer[0] = cx;
        answer[1] = cy;
        return answer;
    }
}



// class Solution {
//     public int[] solution(String[] park, String[] routes) {
        
//         int sx = 0;
//         int sy = 0;
        
//         int rowLen = park.length;
//         int colLen = park[0].length();
        
//         for (int i=0; i<park.length; i++) {
//             for (int j=0; j<park[i].length(); j++) {
//                 if (park[i].charAt(j) == 'S') {
//                     sx = i; sy = j;
//                     break;
//                 }
//             }
//         }
        

//         for(String route : routes){
//             String way = route.split(" ")[0];
//             int length = Integer.parseInt(route.split(" ")[1]);
            
//             int nx = sx;
//             int ny = sy;
            
//             for (int i = 0; i < length; i++){
//                 if (way.equals("E")) {
//                     ny++;
//                 }
//                 if (way.equals("W")) {
//                     ny--;
//                 }
//                 if (way.equals("S")) {
//                     nx++;
//                 }
//                 if (way.equals("N")) {
//                     nx--;
//                 }
//                 if (0 <= nx && nx < rowLen && 0 <= ny && ny < colLen) {
//                     if (park[nx].charAt(ny) == 'X') {
//                         break;
//                     }
//                     if(i == length-1){
//                         sx = nx;
//                         sy = ny;
//                     }
//                 }
//             }
//         }       
        
//         int[] answer = {sx, sy};
//         return answer;
//     }
// }
