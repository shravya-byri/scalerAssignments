package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3));
        System.out.println(solve1(A));
    }
    public static ArrayList<ArrayList<Integer>> solve1(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Collections.sort(A);
        solve(A,new ArrayList<>(), res,0);
        return res;
    }
    public static void solve(ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res,int i) {
        res.add(new ArrayList<>(temp));
        if(i >= A.size()){
            return;
        }
        for(int j = i; j < A.size(); j++) {

            temp.add(A.get(j));
            solve(A,temp,res,j+1);
            temp.remove(temp.size()-1);

        }
    }
}

