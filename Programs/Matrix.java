import java.util.Scanner;
class Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3]; 
        System.out.println("Enter elements of Matrix A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {          
            for (int j = 0; j < 3; j++) {     
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {  
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Product of Matrix A and B is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
