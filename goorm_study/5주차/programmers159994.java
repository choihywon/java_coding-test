import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Deque<String> q1 = new ArrayDeque<>();
        Deque<String> q2 = new ArrayDeque<>();
        for(String s : cards1) {
            q1.addLast(s);
        }
        for(String s : cards2) {
            q2.addLast(s);
        }
        for(String s : goal) {
            if(s.equals(q1.peek())) {
                q1.poll();
            }
            else if(s.equals(q2.peek())) {
                q2.poll();
            }
            else {
                return "NO";
            }
        }
        return "YES";
    }
}

public class programmers159994 {
    public static void main(String[] args) {
        // 입력 데이터 설정
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        // Solution 클래스의 인스턴스 생성
        Solution solution = new Solution();
        // solution 메서드 호출 및 결과 출력
        String result = solution.solution(cards1, cards2, goal);
        System.out.println(result);
    }
}