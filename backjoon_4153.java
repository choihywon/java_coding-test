package backjoon_4153;
import java.util.Scanner;

public class backjoon_4153 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        while(true) {
            n1 = in.nextInt();
            n2 = in.nextInt();
            n3 = in.nextInt();
            // 모든 입력이 0이면 루프 종료
            if(n1 == 0 && n2 == 0 && n3 == 0)
            {
                break;
            }
            // 피타고라스 정리를 이용한 직각삼각형 판별
            if(n1 > n2 && n1 > n3) {
                if(n2*n2 + n3*n3 == n1*n1)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
            else if(n2 > n1 && n2 > n3) {
                if(n1*n1 + n3*n3 == n2*n2)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
            else {
                if(n1*n1 + n2*n2 == n3*n3)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
        in.close();
    }
}
