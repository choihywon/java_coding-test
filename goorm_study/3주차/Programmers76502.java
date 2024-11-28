import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i) + s.substring(0, i);
            if(isValid(sub)) answer++;
        }
        return answer;
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if(ch != '('  && c == ')') return false;
                else if(ch != '{' &&  c == '}') return false;
                else if( ch != '['  && c == ']') return false;
            }

        }
        return stack.isEmpty();
    }
}

public class Programmers76502 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "[](){}";
        String s2 = "}]()[{";
        String s3 = "[)(]";
        String s4 = "(((";


        System.out.println(solution.solution(s1));
        System.out.println(solution.solution(s2));
        System.out.println(solution.solution(s3));
        System.out.println(solution.solution(s4));

    }
}