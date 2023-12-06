// https://school.programmers.co.kr/learn/courses/30/lessons/172928
class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int sx = 0;
        int sy = 0;
        
        int rowLen = park.length;
        int colLen = park[0].length();
        
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    sx = i; sy = j;
                    break;
                }
            }
        }
        

        for(String route : routes){
            String way = route.split(" ")[0];
            int length = Integer.parseInt(route.split(" ")[1]);
            
            int nx = sx;
            int ny = sy;
            
            for (int i = 0; i < length; i++){
                if (way.equals("E")) {
                    ny++;
                }
                if (way.equals("W")) {
                    ny--;
                }
                if (way.equals("S")) {
                    nx++;
                }
                if (way.equals("N")) {
                    nx--;
                }
                if (0 <= nx && nx < rowLen && 0 <= ny && ny < colLen) {
                    if (park[nx].charAt(ny) == 'X') {
                        break;
                    }
                    if(i == length-1){
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }       
        
        int[] answer = {sx, sy};
        return answer;
    }
}
