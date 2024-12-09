import java.io.*;
import java.util.*;

public class backjoon1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }
        sb.append("<");

        while(!queue.isEmpty()){
            for(int i =  1; i < k; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            if(!queue.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}