package backjoon_2869;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int stick = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int day = 0;
		day = (stick - down - 1 ) / (up-down)+1;
		System.out.println(day);
	}

}
