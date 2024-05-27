package class2;
import java.io.*;

public class backjoon_10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 입력된 수의 최대값인 10,000까지의 빈도수를 저장할 배열 생성
        int[] count = new int[10001];

        // 입력된 수의 빈도수를 계산하여 배열에 저장
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        // 빈도수에 따라 정렬된 결과를 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(Integer.toString(i));
                bw.newLine();
                count[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
	}

}
