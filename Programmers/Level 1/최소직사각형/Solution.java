// https://school.programmers.co.kr/learn/courses/30/lessons/86491
import java.util.*;
class Solution {
    public int solution(int[][] sizes) {

        // 초기값 설정
        int w = sizes[0][0];
        int h = sizes[0][1];
        
        for (int i=1; i<sizes.length; i++) {
            int value1 = Math.max(sizes[i][0], w);
            int value2 = Math.max(sizes[i][1], h);
            
            int value3 = Math.max(sizes[i][1], w);
            int value4 = Math.max(sizes[i][0], h);
            
            if (value1 * value2 < value3 * value4) {
                w = value1;
                h = value2;
            } else {
                w = value3;
                h = value4;
            }
        }

        return w * h;
    }
}
