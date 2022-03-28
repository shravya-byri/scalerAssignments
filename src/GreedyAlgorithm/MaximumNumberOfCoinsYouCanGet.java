package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumNumberOfCoinsYouCanGet {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(maxCoins(A));


    }

    public static  int maxCoins(ArrayList<Integer> A) {

        Collections.sort(A);
        int sum = 0;
        int initial = 0;
        int b;
        b = A.size() - 1;
        while (initial < b) {
            sum = sum + A.get(b - 1);
            initial++;
            b = b - 2;

        }
        return sum;
    }
}
