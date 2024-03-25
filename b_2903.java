import java.io.*;

public class b_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 2;
        for(int i = 1; i<=n; i++) {
            result = (result - 1) + result;
        }
        System.out.println(result*result);
    }
}
