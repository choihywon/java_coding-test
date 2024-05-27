
import java.io.*;
import java.util.StringTokenizer;
import java.math.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
		int gcd =0;
		int lcm =0;
        for(int i = 1; i<=num1 && i <= num2; i++) {
			if(num1 % i ==0 && num2 % i ==0) {
				gcd =i;
			}
		}
		for(int i = Math.max(num1,num2); i<=num1*num2; i++) {
			if(i%num1 == 0 && i % num2 ==0) {
				lcm = i;
				break;
			}
		}
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
