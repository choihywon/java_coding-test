
public class Main {

    public static void main(String[] args) {
        int k = 2;
        int[] requests = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5};

        // Solution 클래스의 maxApprovedRequests 메서드를 호출하여 결과 출력
        int result = Solution(k, requests);

        // 예시 출력
        System.out.println(result);  // 출력: 9
    }

    private static int Solution(int k, int[] requests) {
        int answer = 0; //답
        int day = requests[0];
        int improveDay = 0; //지금날짜 승인
        for(int  i =0; i< requests.length; i++){
            if(day == requests[i]){
                if(improveDay < k){
                    improveDay++;
                    answer++;
                }
            }
            else {
                day = requests[i];
                improveDay =1;
                answer++;
            }
        }
        return answer;
    }
}

