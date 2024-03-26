import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        convert(n,b);
    }

    public static void convert(int n, int b) {
       String result = "";
       while(n > 0) {
           int r = n/b;
           int remain = n%b;
           if(remain >=10) {
               result = (char)(remain + 'A' - 10) + result;
           } else {
               result = remain + result;
           }
           n = r;
       }
        System.out.println(result);
    }
}
