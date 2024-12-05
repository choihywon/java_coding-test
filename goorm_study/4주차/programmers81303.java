import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {

        boolean[] isDeleted = new boolean[n];
        ArrayDeque<Integer> deletedStack = new ArrayDeque<>(); // 삭제한
        int current = k;

        for (String command : cmd) {
            char operation = command.charAt(0);

            if (operation == 'U') {
                int X = Integer.parseInt(command.split(" ")[1]);
                for (int i = 0; i < X; i++) {
                    do {
                        current--;
                    } while (isDeleted[current]);
                }
            } else if (operation == 'D') {
                int X = Integer.parseInt(command.split(" ")[1]);
                for (int i = 0; i < X; i++) {
                    do {
                        current++;
                    } while (isDeleted[current]);
                }
            } else if (operation == 'C') {
                isDeleted[current] = true;
                deletedStack.push(current);

                if (current == n - 1) {
                    do {
                        current--;
                    } while (current >= 0 && isDeleted[current]);
                } else {
                    do {
                        current++;
                    } while (current < n && isDeleted[current]);
                }
            } else if (operation == 'Z') {
                int restored = deletedStack.pop();
                isDeleted[restored] = false;
            }
        }

        // 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(isDeleted[i] ? 'X' : 'O');
        }

        return result.toString();
    }
}


public class programmers81303 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 8;
        int k1 = 2;
        String[] cmd1 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};
        System.out.println(sol.solution(n1, k1, cmd1));

        int n2 = 8;
        int k2 = 2;
        String[] cmd2 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
        System.out.println(sol.solution(n2, k2, cmd2));
    }
}