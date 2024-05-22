package backjoon_2292;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(bulzip(n));
	}
	
	public static int bulzip(int n) {
		if(n == 1)
			return 1;
		
		int res = 1;
		int max = 1;
		while(true) {
			max += 6*res;
			res++;
			
			if(n <= max)
				break;
		}
		
		return res;
	}
}
