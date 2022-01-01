package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class ClosestPairFromSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,3,5,7,9));
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 4,6,8,10 ));
        int C =10;
        System.out.println(solve(A,B,C));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0; int j = B.size()-1;
        int first = 0;
        int sec = B.size()-1;
        int diff = Math.abs(A.get(i) + B.get(j) - C);
        int diff1; int diff2;
        while(i < A.size() && j >= 0 ){
            if(Math.abs(A.get(i) + B.get(j) - C) == 0) {
                first = i;
                sec = j;
                break;
            } else if((A.get(i) + B.get(j) - C < 0)) {
                    diff1 = Math.abs(A.get(i) + B.get(j)-C);
                    if(diff1 < diff) {
                        first = i;
                        sec = j;
                        diff = diff1;
                    } else if(diff1 == diff) {
                        if(sec > j && first == i) {
                            sec = j;
                        }

                    }
                    i++;
            } else {
                    diff2 = (A.get(i) + B.get(j) - C);
                    if(diff2 < diff) {
                        first = i;
                        sec = j;
                        diff = diff2;
                    } else if(diff2 == diff ) {
                        if(first > i && sec == j) {
                            first = i;
                        }
                    }
                    j--;
            }

        }
        ans.add(A.get(first));
        ans.add(B.get(sec));

        return ans;
    }
}
