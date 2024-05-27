package backjoon_2525;

import java.util.Scanner;

public class backjoon_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();
        int t = in.nextInt();

        hour += t / 60;
        min += t % 60;
        
        if(min >= 60){
            hour += 1;
            min -= 60;
        }
        if(hour >= 24){
            hour -= 24;
        }
        
        System.out.println(hour + " " + min);

	}

}
