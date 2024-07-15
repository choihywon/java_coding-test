package backjoon1100;
import java.util.Scanner;

public class backjoon1100 {

	public static void main(String[] args) {
		String[][] chess = new String[8][8];
        int count = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            String line = in.next(); // 문자열 대신 문자를 입력받음
            for (int j = 0; j < 8; j++) {
            	if ((i + j) % 2 == 0 && line.charAt(j) == 'F') 
            	{
                    count++;
            	}
            }
        }

       

        System.out.println(count);
	}

}
