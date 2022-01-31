package Searching;

import java.util.ArrayList;
import java.util.List;

public class mock {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(12, 35, 1, 10, 34, 1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int sec_Max = Integer.MIN_VALUE;
        for(int i = 0; i< A.size(); i++) {
            if(A.get(i) > max){
                max = A.get(i);
                index = i;
            }
        }
        int temp = A.get(A.size()-1);
        A.set(A.size()-1,max);
        A.set(index,temp);

        for(int i = 0; i < A.size()-1; i++) {
            if(A.get(i) > sec_Max) {
                sec_Max = A.get(i);
            }

        }
        return sec_Max;
    }
}
