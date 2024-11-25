package backjoon_1676;
import java.util.Scanner;

public class backjoon_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int cnt = 0; 
		for(int i = 1; i<=n; i++)
		{
			if(i%5 == 0)
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
