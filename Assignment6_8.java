// 💡 **Question 8**
// Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.


import java.util.Scanner;
public class Assignment6_8 { 


        public static int[][] multiply(int[][] M1, int[][] M2) {
            int rowsA = M1.length;
            int colsA = M1[0].length;
            int colsB = M2[0].length;
    
            int[][] finalM = new int[rowsA][colsB];
    
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        finalM[i][j] += M1[i][k] * M2[k][j];
                    }
                }
            }
    
            return finalM;
        }

public static void main(String[] args) {
            int[][] M1 = {
                {1 ,0,0},
                {-1,0,0}
            };
    
            int[][] M2 = {
                {7,0,0},
                {0,0,0},
                {0,0,1}
            };
    
            int[][] finalMM = multiply(M1, M2);
    
            // Print the finalMMing matrix
            for (int[] row : finalMM) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
