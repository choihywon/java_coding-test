import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> score =  new HashMap<>();
        // score.put("name", 0);
        // score.put("yearning", 1);
        // score.put("photo", 2);

        for(int i=0; i< name.length; i++){
            score.put(name[i], yearning[i]);
        }
        for(int i =0; i<photo.length; i++) {
            for(int j =0; j<photo[i].length;j++) {
                if(score.containsKey(photo[i][j])) {
                    answer[i] = answer[i] + score.get(photo[i][j]);
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}