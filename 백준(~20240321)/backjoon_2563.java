package java_7;
import java.io.*;

public class b_2563 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dohaji[][] = new int[100][100];
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i<n; i++) {
			String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
		
            for(int j = x; j< x+10; j++) {
            	for(int k = y; k<y+10; k++) {
            		dohaji[j][k] = 1;
            	}
            }
		}
		
		for(int i = 0; i< 100; i++) {
        	for(int j = 0; j< 100; j++) {
        		if(dohaji[i][j] == 1)
        			cnt++;
        		
        	}
        }
		
		System.out.println(cnt);
	}
}
