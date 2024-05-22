import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String b = inputs[0];
        int n = Integer.parseInt(inputs[1]);
        convert(b, n);
    }

    public static void convert(String b, int n) {
        int result = 0;
        int jari = 1;
        for(int i = b.length()-1; i>=0; i--) {
             char c = b.charAt(i);
             int current = 0; // 자리수 변환을 위해(string -> int)
             if(c >= '0' && c <= '9')
                 current = c - '0';
             else
                 current = c - 'A' + 10;

             result = result + (current*jari);
             jari = jari*n;
        }
        System.out.println(result);
    }
}
