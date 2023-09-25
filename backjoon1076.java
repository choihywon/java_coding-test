package backjoon1076;
import java.util.Scanner;

public class backjoon1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		long result = 0;
		long mul = 1;
		int[] array = new int[2];
		String color1 = in.nextLine();
		String color2 = in.nextLine();
		String color3 = in.nextLine();
		
		
		for(int i =0; i<10; i++)
		{
			if(color1.equals(color[i]))
				array[0] = i;
			if(color2.equals(color[i]))
				array[1] = i;
		}
		
		result  = array[0] * 10 + array[1];
		for(int i =0; i<10; i++)
		{
			if(color3.equals(color[i]))
			{
				
				break;
			}	
			mul = mul*10;
		}
		
		result *= mul;
		System.out.println(result);
	}
	
}
