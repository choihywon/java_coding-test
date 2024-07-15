import java.util.*;

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;


        Map<String, Integer> friendIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            friendIndex.put(friends[i], i);
        }


        int[][] giftCounts = new int[n][2];


        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giverIdx = friendIndex.get(parts[0]);
            int receiverIdx = friendIndex.get(parts[1]);
            giftCounts[giverIdx][0]++;
            giftCounts[receiverIdx][1]++;
        }


        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = giftCounts[i][0] - giftCounts[i][1];
        }


        int[] nextMonthGifts = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int givenByIToJ = countGiftsBetween(friends[i], friends[j], gifts);
                int givenByJToI = countGiftsBetween(friends[j], friends[i], gifts);

                if (givenByIToJ > givenByJToI) {
                    nextMonthGifts[i]++;
                } else if (givenByIToJ < givenByJToI) {
                    nextMonthGifts[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            nextMonthGifts[i] = Math.min(nextMonthGifts[i], 3);
        }


        int maxGifts = 0;
        for (int i = 0; i < n; i++) {
            if (nextMonthGifts[i] > maxGifts) {
                maxGifts = nextMonthGifts[i];
            }
        }

        return maxGifts;
    }


    private int countGiftsBetween(String giver, String receiver, String[] gifts) {
        int count = 0;
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            if (parts[0].equals(giver) && parts[1].equals(receiver)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(sol.solution(friends, gifts));
    }
}
