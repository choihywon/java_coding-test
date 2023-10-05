package backjoon1010;
import java.util.Scanner;
import java.math.BigInteger;

public class backjoon1010 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt(); // 테스트 케이스 수

	        for (int t = 0; t < T; t++) {
	            int N = sc.nextInt(); // 서쪽 사이트 개수
	            int M = sc.nextInt(); // 동쪽 사이트 개수

	            // BigInteger 객체를 사용하여 조합 계산
	            BigInteger num = BigInteger.ONE;
	            BigInteger deno = BigInteger.ONE;

	            // 분자 계산 (M부터 (M-N+1)까지의 곱)
	            for (int i = M; i >= M - N + 1; i--) {
	                num = num.multiply(BigInteger.valueOf(i));
	            }

	            // 분모 계산 (N! = 1부터 N까지의 곱)
	            for (int i = 1; i <= N; i++) {
	                deno = deno.multiply(BigInteger.valueOf(i));
	            }

	            // 결과 계산
	            BigInteger result = num.divide(deno);

	            // 결과 출력
	            System.out.println(result);
	        }

	        sc.close();
	}

}
