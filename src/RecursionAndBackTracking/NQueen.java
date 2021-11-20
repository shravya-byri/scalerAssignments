package RecursionAndBackTracking;

import java.util.ArrayList;

public class NQueen {
    public static void main(String[] args) {
        int A = 5;
        System.out.println(solve(A));
    }
    public static boolean solve(int A) {
        ArrayList<Integer> column = new ArrayList<>();
        for(int i = 0; i < A; i++) {
            column.add(-1);
        }
        int row = 0;
        return nQueen(row,column,A);
    }
    public static boolean nQueen(int row, ArrayList<Integer> column, int A){
        if (row == A) return true;
        for(int c = 0; c < A; c++) {
            if(isValid(row,c,column,A)) {
                column.set(row,c);
                nQueen(row+1,column,A);
                column.set(row,-1);
            }
        }
        return false;

    }
    public static boolean isValid(int row,int c, ArrayList<Integer> column, int A){
        for(int i = 0; i < row; i++) {
            if(column.get(row) == c) return false;
            if((row + c) == (i + column.get(i)) || (row - i) ==(c - column.get(i))) return false;

        }
        return true;
    }
}
