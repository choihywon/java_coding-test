import java.util.*;


class Solution {
    boolean solution(String s) {
//        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }

            if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else stack.pop();
            }
        }
        if(!stack.isEmpty())
            return false;

        return true;
    }
}

public class Programmers12909 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트 케이스
        String[] testCases = {
                "()()",
                "(())()",
                ")()(",
                "(()("
        };

        for (String s : testCases) {
            boolean result = solution.solution(s); // 객체를 통해 메서드 호출
            System.out.printf("Input: %s, Result: %b%n", s, result);
        }
    }

}