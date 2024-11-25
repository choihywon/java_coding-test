import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> rank = new HashMap<>();
        for(int i =0; i<players.length; i++) {
            rank.put(players[i],i);
        }

        for(String calling : callings) {

            int calledPlayer = rank.get(calling);

            String front = players[calledPlayer -1];
            players[calledPlayer - 1] = calling;
            players[calledPlayer] = front;

            rank.put(calling, calledPlayer -1 );
            rank.put(front, calledPlayer);


        }

        return players;


    }
}
