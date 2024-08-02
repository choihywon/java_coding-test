//class Solution {
//    public int[] replaceElements(int[] arr) {
//
//        int index = arr[arr.length-1];
//        for(int i=arr.length-1; i>=1; i--){
//            if(arr[i] > arr[i-1]) {
//                arr[i-1] = arr[i];
//            }
//
//
//
//        }
//        arr[arr.length-1] = -1;
//        return arr;
//    }
//}
class Solution {
    public int[] replaceElements(int[] arr) {
        int index = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] > arr[i - 1])
                arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}
//master 서류
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] testCases = {
                {17, 18, 5, 4, 6, 1},
                {400},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {7, 1, 5, 3, 6, 4}
        };

        // 각 테스트 케이스 실행 및 결과 출력
        for (int i = 0; i < testCases.length; i++) {
            int[] result = solution.replaceElements(testCases[i]);
            System.out.print("Test case " + (i + 1) + ": ");
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}