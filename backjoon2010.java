package backjoon2010;
import java.util.Scanner;
public class backjoon2010 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 1;
		//int[] list;
		int n = in.nextInt();
		int list[] = new int[n];
		for(int i =0; i<n; i++)
		{
			list[i] = in.nextInt();
			sum +=list[i];
		}
		System.out.printf("%d",sum-n);
	}

}
