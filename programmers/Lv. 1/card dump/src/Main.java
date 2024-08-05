class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1 = 0;
        int card2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (card1 < cards1.length && cards1[card1].equals(goal[i])) {
                card1++;
            } else if (card2 < cards2.length && cards2[card2].equals(goal[i])) {
                card2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
