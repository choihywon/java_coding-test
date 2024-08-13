import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++) {
            sb.append(solution(br.readLine())).append('\n');
        }
        System.out.print(sb);
    }

    private static String solution(String input) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<input.length(); i++) {
            char c = input.charAt(i);
            if(c == '(') {
                stack.push(c);
            }
            else if(stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}