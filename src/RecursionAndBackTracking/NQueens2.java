package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueens2 {
    public static void main(String[] args) {
        int N = 1;

        // `mat[][]` keeps track of the position of queens in
        // the current configuration
        char[][] mat = new char[N][N];
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        // initialize `mat[][]` by `-`
        for (int i = 0; i < N; i++) {
            Arrays.fill(mat[i], '.');
        }

        nQueen(mat, 0, res);
        System.out.println(res);
    }

    private static boolean isSafe(char[][] mat, int r, int c)
    {
        // return false if two queens share the same column
        for (int i = 0; i < r; i++)
        {
            if (mat[i][c] == 'Q') {
                return false;
            }
        }

        // return false if two queens share the same `` diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
        {
            if (mat[i][j] == 'Q') {
                return false;
            }
        }

        // return false if two queens share the same `/` diagonal
        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++)
        {
            if (mat[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static ArrayList<String> matrixToResult(char[][] mat)
    {
        ArrayList<String> r = new ArrayList<>();
        for (char[] chars: mat) {
            r.add(new String(chars));
        }
        return r;
    }


    private static void nQueen(char[][] mat, int r, ArrayList<ArrayList<String>> res)
    {
        // if `N` queens are placed successfully, print the solution
        if (r == mat.length)
        {
            res.add(matrixToResult(mat));
            return;
        }

        // place queen at every square in the current row `r`
        // and recur for each valid movement
        for (int i = 0; i < mat.length; i++)
        {
            // if no two queens threaten each other
            if (isSafe(mat, r, i))
            {
                // place queen on the current square
                mat[r][i] = 'Q';

                // recur for the next row
                nQueen(mat, r + 1, res);

                // backtrack and remove the queen from the current square
                mat[r][i] = '.';
            }
        }
    }
}
