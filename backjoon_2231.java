package backjoon_2231;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i =0; i<n; i++) {
			int num = i;
			int mid = 0;
			while(num != 0) {
				mid += num%10;
				num = num/10;
			}
			if(n == mid + i) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
