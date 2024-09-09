import java.util.*;
2
class Solution {
3
    public int solution(int k, int m, int[] score) {
4
        int answer = 0;
5
        Arrays.sort(score);
6
        for(int i = score.length - m; i >= 0; i -= m)
7
            answer += score[i] * m;
8
        return answer;
9
    }
10
}
