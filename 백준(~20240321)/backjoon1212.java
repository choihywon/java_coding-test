package backjoon1212;
import java.util.Scanner;

public class backjoon1212 
{

	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        String[] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String s = scan.nextLine();
        StringBuilder bi = new StringBuilder();

        // 입력받은 수가 0인 경우
        if (s.length() == 1 && s.charAt(0) == '0') 
        {
            System.out.print(0);
        } else 
        {
            for (int i = 0; i < s.length(); i++) 
            {
                int digit = Character.getNumericValue(s.charAt(i));
                if (i == 0 && digit < 4)
                {
                    if (digit == 0) 
                    {
                        bi.append("0");
                    }
                    else if (digit == 1) 
                    {
                        bi.append("1");
                    } 
                    else if (digit == 2) 
                    {
                        bi.append("10");
                    } 
                    else if (digit == 3)
                    {
                        bi.append("11");
                    }
                } 
                else 
                {
                    bi.append(eight[digit]);
                }
            }
            System.out.print(bi.toString());
        }
    }
}