import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());

       String expression = br.readLine();

        String[] value = new String[n];

       for(int i = 0; i < n; i++) {
            value[i] = br.readLine();
       }

       double result = solution(expression, value);

       System.out.printf("%.2f", result);
    }

    public static double solution(String expression, String[] input) {
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                stack.push(Double.parseDouble(input[c - 'A']));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                if(c == '+') stack.push(a + b);
                if(c == '-') stack.push(a - b);
                if(c == '*') stack.push(a * b);
                if(c == '/') stack.push(a / b);
            }
        }
        return stack.pop();
    }
}

