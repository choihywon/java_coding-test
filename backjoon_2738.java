// tip: each public class is put in its own file
import java.io.*;

public class Main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        int[][] result = new int[n][m];

        //first_matrix
        for(int i =0; i<n; i++) {
             String[] input = br.readLine().split(" ");
            for(int j = 0; j<m; j++) {
                matrix1[i][j] = Integer.parseInt(input[j]);
            }
        }
        //second matrix
        for(int i =0; i<n; i++) {
             String[] input = br.readLine().split(" ");
            for(int j = 0; j<m; j++) {
                matrix2[i][j] = Integer.parseInt(input[j]);
            }
        }
        //sum
        for(int i =0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i =0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
