package backjooN_119_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class backjoon_1193 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int count = 0;
			int i = 1;
			int deno = 0;
			int numer = 0;
			while(count < x) {
				count = count + i;
				i++;
			}
	        
			if((i-1)%2 == 0) {
				deno = 1 + (count - x);
				numer = (i-1) - (count-x);
			}else {
				deno = (i-1) - (count-x);
				numer = 1 + (count - x);
			}
			
			
			System.out.println(numer  + "/" + deno);
		
	}

}
