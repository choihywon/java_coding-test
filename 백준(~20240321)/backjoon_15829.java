import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long sum =0;
        long res=1;
        for (int i = 0; i < L; i++) {
            char ch = str.charAt(i);
            int alphaToNum = ch - 'a' + 1;
            
            sum = (sum + alphaToNum * res) % 1234567891;
            res = (res * 31) % 1234567891;
        }
        
        System.out.println(sum);
        
	}

}
