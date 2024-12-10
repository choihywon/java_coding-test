import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int size = progresses.length;
        Deque<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            //(100-progresses[i])%speeds[i] == 0 은 작업량이 속도를 나누어떨어지면 끝난다는 거다.
           if((100 - progresses[i]) % speeds[i] == 0)
               //남은 작업일을 계산하는거
               queue.offer((100-progresses[i])/speeds[i]);
           else
               //아니면 하루 더 필요하니깐 +1
               queue.offer(((100-progresses[i])/speeds[i])+1);
        }
        //이제 queue에는 작업량이 저장되어있으니깐 처리해주면 된다.
        int current = queue.poll();
        int cnt = 1;
        while(!queue.isEmpty()) {
            //지금 처리하는 작업일보다 시간이 더 많이 필요하기 전까지는 한꺼번에 처리할 수 있다.
            if(queue.peek() <= current) {
                queue.poll();
                cnt++;
            }
            //더 많은 시간이 필요한 친구 만나면 작업일 새로 계산해야하니깐
            else {
                result.add(cnt);
                cnt = 1;
                current = queue.poll();
            }
        }
        result.add(cnt);
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}

public class programmers42586 {
    public static void main(String[] args) {
        int[] progresses1 = {93,30,55};
        int[] speeds1 = {1,30,5};
        Solution solution = new Solution();
        solution.solution(progresses1, speeds1);
    }
}