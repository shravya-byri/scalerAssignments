package Sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4,2,7,8,3,1));
       insertionsSort(A);
       System.out.println(A);
    }
    public static void insertionsSort(ArrayList<Integer> A) {
        int j = 0;
        for(int i = 0; i < A.size()-1; i++) {
            j = i;
               while(j >= 0) {
                    if(A.get(j) > A.get((j+1))) {
                    int temp = A.get(j);
                    A.set(j,A.get(j+1));
                    A.set(j+1,temp);
                }
                    j--;
            }
        }
    }
}
