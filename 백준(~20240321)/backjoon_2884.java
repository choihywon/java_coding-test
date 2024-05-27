package backjoon_2884;
import java.util.Scanner;

public class backjoon_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt(); // 시
		int min = in.nextInt(); // 분
		
		if(min < 45) 
		{
			hour--;
			min = 60 - (45 - min); 
			if(hour < 0) 
			{
				hour = 23;
			}
			System.out.println(hour + " " + min);
		}
		else 
		{
			System.out.println(hour + " " + (min - 45));
		}

	}

}
