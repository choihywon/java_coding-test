package class2;
import java.io.*;

public class c2_11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 첫 번째 숫자
        int C = Integer.parseInt(input[1]); // 두 번째 숫자
        long top = factorial(N);
        long bottom = factorial(C)*factorial(N-C); 
        System.out.print(top/bottom);

	}
	public static long factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
