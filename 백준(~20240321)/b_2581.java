import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int cnt =0;
        int min =0;
        for(int i = m; i<= n; i++) {
            cnt +=  sosu(i);
            if(cnt == sosu(i)){
                min = cnt;
            }

        }
        if(cnt == 0)
            System.out.println(-1);
        else {
            System.out.println(cnt);
            System.out.println(min);
        }

    }

    public static int sosu(int num) {
        int cnt = 0;
        if(num==1) {
            return 0;
        }

        for(int i = 2; i< num; i++) {
            if (num % i == 0)
                return 0;
        }
        return num;
    }

}
