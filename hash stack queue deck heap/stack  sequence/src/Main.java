import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        List<Integer> stack = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int nextPush = 1;
        for(int i = 0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i =0; i<n; i++) {
            int current = arr[i];
            while(nextPush <= current)
            {
                stack.add(nextPush++);
                sb.append("+\n");
            }
            if(stack.get(stack.size()-1).equals(current)) {
                stack.remove(stack.size()-1);
                sb.append("-\n");
            }
            else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb.toString());

    }
}
