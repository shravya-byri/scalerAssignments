package Sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(0,1,2,3,4,5));
        bubbleSort(A);
    }
    public static void bubbleSort(ArrayList<Integer> A) {
        for(int i = 0; i < A.size()-1; i++) {
            for(int j = 0; j < A.size()-i-1; j++) {
                if(A.get(j) > A.get(j + 1)) {
                    int temp = A.get(j);
                    A.set(j,A.get(j+1));
                    A.set((j+1),temp);
                }
            }
        }
        System.out.println(A);

    }
}
