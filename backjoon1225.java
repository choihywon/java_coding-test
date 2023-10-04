package backjoon1225;
import java.util.Scanner;


public class backjoon1225
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		int cnt = 0;
		if (first.length() > second.length())
		{
            String temp = first;
            first = second;
            second = temp;
        }
		for (int i = 0; i < first.length(); i++) 
		{
            for (int j = 0; j < second.length(); j++) 
            {
                int digit1 = Character.getNumericValue(first.charAt(i));
                int digit2 = Character.getNumericValue(second.charAt(j));
                cnt += digit1 * digit2;
            }
        }
		System.out.println(cnt);
	
	}

}
