class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 1;
        for(int i=0; i<section.length; i++){
            if(paint<=section[i]){
                paint=section[i]+m;
                answer++;
            }
        }

        return answer;
    }
}