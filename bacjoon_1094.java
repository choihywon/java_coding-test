package backjoon_1094;
import java.util.Scanner;


public class bacjoon_1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int bar = in.nextInt();
		int wonlae = 64;
		int next = 0;
		int count = 0;
		
		while(bar > 0)
		{
			if(wonlae > bar)
			{
				wonlae /= 2;
			}
			else
			{
				bar = bar-wonlae;
				count++;
			}
		}
		System.out.println(count);
	}

}


