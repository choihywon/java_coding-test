package backjoon_1312;
import java.util.Scanner;

public class backjoon_1312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int answer = num1%num2;
		int result = 0;
		int n = in.nextInt();
		for(int i =0; i<n-1; i++)
		{
			answer = answer * 10;
			answer = answer % num2;
			
		}
		answer = answer * 10;
		answer = answer / num2;
		System.out.println(answer);
	}
}
