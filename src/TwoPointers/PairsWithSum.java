package TwoPointers;

import java.util.*;

public class PairsWithSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 2, 3, 3, 5, 7, 7, 8, 9, 9, 10, 10));
        System.out.println(solve(A,11));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        long res = 0; int i = 0; int j = A.size()-1;
        Collections.sort(A);
        while(i < j) {
            int des = A.get(i) + A.get(j);
            if(des < B) {
                i++;
            } else if(des == B) {
                if(Objects.equals(A.get(i), A.get(j))) {
                    int x = j - i + 1;
                    res = res + ((long)x * (x - 1)/2) % 1000000007;
                    break;
                } else if(!(Objects.equals(A.get(i), A.get(j)))) {
                    int a = 1;
                    int b = 1;
                    while (Objects.equals(A.get(i), A.get(i + 1))) {
                        a++;
                        i++;
                    }
                    while (Objects.equals(A.get(j), A.get(j - 1))) {
                        b++;
                        j--;
                    }
                    res = res + ((long) a * b) % 1000000007;
                }
                i++;
                j--;
            }else {
                j--;
            }
        }

       res = res % 1000000007;
        return (int)res;
    }
}
