package backjoon1075;
import java.util.Scanner;

public class backjoon1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int f = in.nextInt();
		int res = 0;
		int check = 0;
		n = n/100;
		n = n*100;
		while(n%f != 0)
		{
			n++;
			res++;
		}
		if(res < 10)
			System.out.printf("0%d",res);
		else
			System.out.printf("%d", res);
	}

}
