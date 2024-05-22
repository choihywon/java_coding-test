package backjoon_2588;

import java.util.Scanner;

public class backjoon_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		int num1 = in.nextInt();
		int num2 = in.nextInt();

 
		System.out.println(num1*(num2%10));
		System.out.println(num1*(num2%100/10));
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);
	}

}
