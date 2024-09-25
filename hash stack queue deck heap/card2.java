import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i<=n; i++) {
            queue.add(i);
        }
        while(queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.print(queue.poll());
    }
}
