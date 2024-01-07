// https://school.programmers.co.kr/learn/courses/30/lessons/42583
import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int time = 0;
        
        // 다리 위의 트럭 무게
        int bridge_weight = 0;
        // 대기중인 트럭
        Queue<Integer> wait_truck = new LinkedList<>();
        for (int truck : truck_weights) {
            wait_truck.add(truck);
        }
        // 다리 길이만큼 0으로 채우기
        Queue<Integer> bridge = new LinkedList<>();
        for (int i=0; i<bridge_length; i++) {
            bridge.add(0);
        }
        
        while (!wait_truck.isEmpty() || bridge_weight > 0) {
            int tmp = bridge.poll();
            bridge_weight -= tmp;
            if (!wait_truck.isEmpty() && bridge_weight + wait_truck.peek() <= weight) {
                int truck = wait_truck.poll();
                bridge_weight += truck;
                bridge.add(truck);
            } else {
                bridge.add(0);
            }
            time++;
        }
        
        
        return time;
    }
}
