// https://school.programmers.co.kr/learn/courses/30/lessons/17683
import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
 
        m = changeMelody(m);
        
        List<String> list = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<musicinfos.length; i++) {

            String startTime = musicinfos[i].split(",")[0];
            String endTime = musicinfos[i].split(",")[1];
            String title = musicinfos[i].split(",")[2];
            String score = changeMelody(musicinfos[i].split(",")[3]);
            
            int startHour = Integer.parseInt(startTime.split(":")[0]);
            int startMinute = Integer.parseInt(startTime.split(":")[1]);
            int start = startHour * 60 + startMinute;
            
            int endHour = Integer.parseInt(endTime.split(":")[0]);
            int endMinute = Integer.parseInt(endTime.split(":")[1]);   
            int end = endHour * 60 + endMinute;
            
            // 총 재생시간
            int runningTime = end - start;
            
            int length = score.length();
            if (runningTime > length) {
                StringBuilder sb = new StringBuilder();
                for (int t=0; t<runningTime / length; t++) 
                    sb.append(score);
                score = score + sb.toString();
            } else if (runningTime <= length) {
                score = score.substring(0, runningTime);
            }
   
           
            for (int j=0; j<score.length() - m.length() + 1; j++) {
                if (score.substring(j, j+m.length()).equals(m)) {         
                    list.add(title);
                    map.put(title, runningTime);
                    break;
                }
            }   
        }
        
        if (list.size() == 0) {
            return "(None)";
        } else {
            list.sort((a,b) -> map.get(b).compareTo(map.get(a)));
            return list.get(0);
        }  

    }
    
    private String changeMelody(String oldMelody) {
        oldMelody = oldMelody.replaceAll("C#", "c");
        oldMelody = oldMelody.replaceAll("D#","d");
        oldMelody = oldMelody.replaceAll("F#","f");
        oldMelody = oldMelody.replaceAll("G#","g");      
        String newMelody = oldMelody.replaceAll("A#","a");
        return newMelody;
    }        

}
