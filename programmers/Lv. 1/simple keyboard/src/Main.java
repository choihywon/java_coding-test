import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> keyPoint = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            String[] keyNum = keymap[i].split("");

            for (int j = 0; j < keyNum.length; j++) {
                if (!keyPoint.containsKey(keyNum[j])) {
                    keyPoint.put(keyNum[j], j + 1);
                    continue;
                }

                if (keyPoint.get(keyNum[j]) > j + 1) {
                    keyPoint.put(keyNum[j], j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String[] keyChange = targets[i].split("");
            answer[i] = 0;
            for (int j = 0; j < keyChange.length; j++) {
                if (!keyPoint.containsKey(keyChange[j])) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += keyPoint.get(keyChange[j]);
                }
            }
        }

        return answer;
    }
}