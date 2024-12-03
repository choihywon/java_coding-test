import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] asnwer = new int[prices.length];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] < prices[st.peekLast()])  { //현재 시점의 가격이 이전 가격보다 낮아진 경우
                int lastIndex = st.pollLast(); //이 인덱스는 가격이 떨어지기 전까지 유지된 시전이다
                asnwer[lastIndex] = i - lastIndex; //가격이 유지된 기간을 계산하고 결과 배열에 저장한다 (현재 시점 - 가격이 떨어진 시점까지의 시간)
            } //스택에서 가격이 떨어진 모든 시점을 처리할 때까지 반복한다.
            st.addLast(i); // 스택은 "가격이 떨어지지 않은 인덱스" 만 저장한다.
        }
        while (!st.isEmpty()) { //끝까지 가격이 덜어지지 않은 시점을 처리 끝까지 유지된 가격을 의미
            int lastIndex = st.pollLast(); //스택에서 마지막 인덱스를 꺼낸다.
            asnwer[lastIndex] = prices.length - lastIndex - 1; //가격이 끝까지 떨어지지 않은 경우의 유지기간을 계산 배열의 끝 에서 해당 시점까지의 시간을 계산
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
