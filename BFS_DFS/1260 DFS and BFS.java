import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        graph = new ArrayList<>();

        int vn = Integer.parseInt(st.nextToken());
        vistied = new boolean[vn +1];
        

    }
}
