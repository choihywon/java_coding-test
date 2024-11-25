package programmers_1122;
import java.util.Scanner;

public class programmers_1122 {
	public static void main(String[] args) {
        //run();
		Dalpang();
    }

	  public static void Dalpang() {
	        Scanner in = new Scanner(System.in);
	        int row = in.nextInt();
	        int col = in.nextInt();
	        int[][] arr = new int[row][col];
	        // 행(세로) : x 열(가로) : y
	        //         우  하  좌  상
	        int di[] = {0, 1, 0, -1};
	        int dj[] = {1, 0, -1, 0};
	        int count = 0; 
	        int cnt = 0;
	        int ni, nj;

	        // 초기 위치 설정
	        int i = 0, j = 0;
	        int dir = 0; // 초기 방향은 오른쪽

	        for (int num = 1; num <= row * col; num++) {
	            arr[i][j] = num;
	            
	            ni = i + di[dir];
	            nj = j + dj[dir];

	            // ni nj가 배열 범위 안에 있고 미방문 상태인 경우에만 방향 전환
	            if (0 <= ni && ni < row && 0 <= nj && nj < col && arr[ni][nj] == 0) {
	                i = ni;
	                j = nj;
	            } else {
	                // 방향 전환
	                dir = (dir + 1) % 4;
	                i += di[dir];
	                j += dj[dir];
	            }
	        }

	        // 결과 출력
	        for (i = 0; i < row; i++) {
	            for (j = 0; j < col; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	
    public static void run() {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        int di[] = {0, 0, 1, -1};
        int dj[] = {1, -1, 0, 0};
        int count = 0; 
        int cnt = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int ni = i + di[k];
                        int nj = j + dj[k];

                        // ni nj 얻었음
                        // 배열 범위 안에 있어야 함
                        if (0 <= ni && ni < row && 0 <= nj && nj < col) {
                            if (arr[ni][nj] == 2)
                                count += 1;
                        }
                    }
                }
                if (arr[i][j] == 2) {
                    for (int k = 0; k < 4; k++) {
                        int ni = i + di[k];
                        int nj = j + dj[k];

                        // ni nj 얻었음
                        // 배열 범위 안에 있어야 함
                        if (0 <= ni && ni < row && 0 <= nj && nj < col) {
                            if (arr[ni][nj] == 1)
                                cnt += 1;
                        }
                    }
                }
            }
        }

        // 결과 출력
        System.out.println("1과 근접한 2의 개수: " + count);
        System.out.println("2와 근접한 1의 개수:" + cnt);
    }
    
    
}
