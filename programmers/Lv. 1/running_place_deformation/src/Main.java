import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>;
        for(int i =0; i<players.length; i++) {
            rank.put(players[i], i);
        }
        for(String calling : callings) {
            int called = rank.get(calling);

            String front = players[called - 1];
            players[called - 1] = calling;
            players[called] = front;

            rank.put(calling, called - 1);
            rank.put(front, called);

        }


        return players;

    }
}

public class Main {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        // Solution 클래스의 인스턴스를 생성하고 solution 메서드를 호출
        Solution solution = new Solution();
        Map<String, Integer> result = solution.solution(players, callings);

        // 결과 출력
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}