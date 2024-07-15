package backjoon_1292;
import java.util.Scanner;

public class backjoon_1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		int cnt = 0;
		int[] arr = new int[1001];
		int k = 0;
		for(int i = 1; i<=1000; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				if(k==1000)
					break;
				k++;
				arr[k] = i;
				
			}
				
			
		}
		
		for(int i = first; i<=second; i++)
		{
			cnt = cnt + arr[i];
			//System.out.println("check" + cnt);
		}
			
		System.out.println(cnt);
	}
	
}
