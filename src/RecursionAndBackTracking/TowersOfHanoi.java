package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class TowersOfHanoi {
    public static void main(String[] args) {
       System.out.println( towerOfHanoi(3));
    }
    public static ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        int N = A;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        towersOfHanoi(N,res,1,3,2);
        return res;
    }

    public static void towersOfHanoi(int n, ArrayList<ArrayList<Integer>> res,int src, int des,int temp) {

        if(n == 0) return;

            towersOfHanoi(n-1,res,src,temp,des);
            ArrayList<Integer> sub1 = new ArrayList<>(List.of(n,src,des));
            res.add(sub1);
            towersOfHanoi(n-1,res,temp,des,src);



    }

}
