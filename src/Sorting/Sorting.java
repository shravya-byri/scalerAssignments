package Sorting;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4,7,9));
        ArrayList<Integer> B = new ArrayList<>(List.of(2,11,19));
        System.out.println(solve(A,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if(A.get(i) < B.get(j)) {
                ans.add(A.get(i));
                i++;
            } else {
                ans.add(B.get(j));
                j++;
            }
        }
        if(i < A.size()) {
            while(i < A.size()) {
                ans.add(A.get(i));
                i++;
            }
        } else if(j < A.size()){
            while(j < B.size()) {
                ans.add(B.get(j));
                j++;
            }
        }

        return ans;
    }
}
