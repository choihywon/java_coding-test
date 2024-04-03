import java.io.*;

public class b_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        soinsu(n);
    }

    public static void soinsu(int n) {
        int k = 2;
        while(n != 1) {
            if(n % k == 0) {
                System.out.println(k);
                n = n / k;
            } else {
                k++;
            }
        }
    }
}
