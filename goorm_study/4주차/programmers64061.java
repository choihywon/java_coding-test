import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < moves.length; i++) {
            int num = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][num] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][num]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][num]);
                    }
                    board[j][num] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

public class programmers64061 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        Solution solution = new Solution();
        int result = solution.solution(board, moves);

        System.out.println(result);
    }


}