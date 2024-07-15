
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length; j++) {
                if(arr[i] == 2* arr[j] && i!=j) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {10, 2, 5, 3};
        Solution solution = new Solution();
        boolean result1 = solution.checkIfExist(arr1);
        System.out.println("Output: " + result1); // Output: true


    }
}