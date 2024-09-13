import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Solution {
    public String makeBigNumber(int N, int K, String number) {
        Stack<Character> stack = new Stack<>();
        int toRemove = K;  

        
        for (int i = 0; i < number.length(); i++) {
            char current = number.charAt(i);

            
            while (toRemove > 0 && !stack.isEmpty() && stack.peek() < current) {
                stack.pop();
                toRemove--;
            }

            stack.push(current);
        }

        
        while (toRemove > 0) {
            stack.pop();
            toRemove--;
        }

        
        StringBuilder result = new StringBuilder();
        for (char num : stack) {
            result.append(num);
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        
        String number = br.readLine();

        
        Solution solution = new Solution();
        String result = solution.makeBigNumber(N, K, number);

        
        System.out.println(result);
    }
}
