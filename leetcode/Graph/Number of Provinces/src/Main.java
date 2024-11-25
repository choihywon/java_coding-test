<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }
    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;
        for(int j =0; j<isConnected.length; j++) {
            if(!visited[j] && isConnected[i][j] == 1) {
                dfs(isConnected, visited, j);
            }
        }
    }
}
>>>>>>> 9e661cbb7df75b134e5154fe07c8e5eee889bc73
