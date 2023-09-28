package backjoon1159;
import java.util.Arrays;
import java.util.Scanner;

public class backjoon1159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        int[] count = new int[26];

        while (people-- > 0) 
        {
            String name = in.next();
            count[name.charAt(0) - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        boolean found = false;

        for (char c = 'a'; c <= 'z'; c++) 
        {
            if (count[c - 'a'] >= 5) 
            {
                result.append(c);
                found = true;
            }
        }
        
        if (found) {
            System.out.println(result);
        } else {
            System.out.println("PREDAJA");
        }

    }

}
