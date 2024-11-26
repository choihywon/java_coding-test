import java.io.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[][][][] visited = new int[11][11][11][11];
        //초기 위치 5,5
        int cx = 5;
        int cy = 5;

        for(char ch : dirs.toCharArray()) {
            int nx = cx, ny = cy;

            if(ch == 'U') {
                ny++;
            }
            else if(ch == 'D') {
                ny--;

            } else if(ch == 'L') {
                nx--;

            } else if(ch == 'R') {
                nx++;
            }
            if(nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
            if (visited[cx][cy][nx][ny] == 0) {
                visited[cx][cy][nx][ny] = 1;
                visited[nx][ny][cx][cy] = 1;
                answer++;
            }
            cx = nx;
            cy = ny;
        }

        return answer;
    }
}

public class Programmers49994 {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        String dirs1 = "ULURRDLLU";
        String dirs2 = "LULLLLLLU";

        System.out.println("Result for dirs1: " + solution.solution(dirs1)); // 예상 결과: 7
        System.out.println("Result for dirs2: " + solution.solution(dirs2)); // 예상 결과: 7
    }
}