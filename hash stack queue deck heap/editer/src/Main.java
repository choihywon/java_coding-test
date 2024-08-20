import java.util.*;
import java.io.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine();


        int M = Integer.parseInt(br.readLine());


        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();


        for (char c : str.toCharArray()) {
            leftStack.push(c);
        }


        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            char cmdType = command.charAt(0);

            if (cmdType == 'L') {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (cmdType == 'D') {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if (cmdType == 'B') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (cmdType == 'P') {
                char addChar = command.charAt(2);
                leftStack.push(addChar);
            }
        }


        StringBuilder sb = new StringBuilder();

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb.toString());
    }
}