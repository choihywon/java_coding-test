package backjoon1152;
import java.util.Scanner;


public class backjoon1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		
		str= in.nextLine();
		str = str.trim(); //시작과 끝 공백 제거
		
		if(str.isEmpty())
		{
			System.out.println(0);
		}
		else
		{
			String[] strArr = str.split(" ");
			System.out.println(strArr.length);
		}
		
	}

}
