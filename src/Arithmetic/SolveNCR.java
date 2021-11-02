package Arithmetic;

public class SolveNCR {
    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int C = 9;
        System.out.println(CombinationMatrix(A,B,C));
    }

    public static int CombinationMatrix(int A,int B, int C) {
        int c[][] = new int[A+1][B+1];
        for(int i = 1; i <= A; i++) {
            for(int j = 0; j <= Math.min(i,B);j++){
                if(j == 0 || j == i) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = c[i-1][j-1]+ c[i-1][j];
                }
            }

        }

        return c[A][B] % C;
    }
}
