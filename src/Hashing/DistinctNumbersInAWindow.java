package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistinctNumbersInAWindow {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 1, 3, 4, 3));
        System.out.println(Solve(A,3));
    }
    public static ArrayList<Integer> Solve(ArrayList<Integer> A,int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i <= A.size()-B+1; i++) {

        }
        return ans;
    }
}
