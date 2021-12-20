package Sort;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(7,2,3,4,1,5,66,33,6));
        selection(A);
    }
    public static void selection(ArrayList<Integer> A) {
        for(int i = 0; i < A.size()-1; i++) {
            int min_id = i;
            for(int j = i; j < A.size(); j++) {
                if(A.get(j) < A.get(min_id)) {
                    min_id = j;
                }
            }
            int temp = A.get(i);
            A.set(i,A.get(min_id));
            A.set(min_id,temp);
        }
        System.out.println(A);
    }
}
