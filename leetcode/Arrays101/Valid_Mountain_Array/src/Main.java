class Solution {
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        if(arr.length < 3)
            return false;
        while(index+1 < arr.length && arr[index] < arr[index+1])
            index++;
        if(index == 0 || index == arr.length-1)
            return false;

        while(index+1 < arr.length && arr[index] > arr[index+1])
            index++;

        if(index == arr.length-1)
            return true;
        return false;

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] testCases = {
                {2, 1},
                {3, 5, 5},
                {0, 3, 2, 1},
                {0, 2, 3, 4, 5, 2, 1, 0},
                {0, 1, 2, 3, 4, 5, 6, 7, 8}
        };

        boolean[] expectedResults = {false, false, true, true, false};

        for (int i = 0; i < testCases.length; i++) {
            boolean result = solution.validMountainArray(testCases[i]);
            System.out.println("Test case " + (i + 1) + ": " + (result == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
}
