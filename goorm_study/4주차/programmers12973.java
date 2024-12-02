import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (!deque.isEmpty() && deque.peekLast() == c) {
                deque.pollLast();
            } else {
                deque.addLast(c);
            }
        }

        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class programmers12973 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution("baabaa"));
        System.out.println(sol.solution("cdcd"));

    }
}