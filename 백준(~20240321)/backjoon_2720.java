import java.io.*;

public class backjoon_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int quarter = 0; //0.25 = 25
        int dime = 0; //0.10 = 10
        int nickel = 0; //0.05 = 5
        int penny = 0; //0.01 = 1
        int money = 0;;
        for(int i = 0; i<n; i++) {
            money = Integer.parseInt(br.readLine());
            quarter = money/25;
            money = money%25;
            dime = money/10;
            money = money%10;
            nickel = money/5;
            money = money%5;
            penny = money/1;

            System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
        }

    }
}
