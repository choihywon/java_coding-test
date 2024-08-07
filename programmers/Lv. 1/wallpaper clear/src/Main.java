import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        // int[] answer = {};
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = 0;
        int maxY = 0;

        for(int i = 0; i<wallpaper.length; i++) {
            for(int j = 0; j<wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    if(i < minX)
                        minX = i;
                    if(i > maxX)
                        maxX = i;
                    if(j < minY)
                        minY = j;
                    if(j > maxY)
                        maxY = j;
                }
            }
        }
        int[] answer = {minX, minY, maxX+1, maxY+1};
        return answer;
    }
}