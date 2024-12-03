import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] asnwer = new int[prices.length];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peekLast()]) {
                int lastIndex = st.pollLast();
                asnwer[lastIndex] = i - lastIndex;
            }
            st.addLast(i);
        }
        while (!st.isEmpty()) {
            int lastIndex = st.pollLast();
            asnwer[lastIndex] = prices.length - lastIndex - 1;
        }
        return asnwer;
    }
}

public class programmers42584 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 2, 3})));
    }

}