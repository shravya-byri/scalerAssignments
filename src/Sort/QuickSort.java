package Sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,1,6,5,9,3,11,4));
         quickSort(A,0,A.size()-1);
         System.out.println(A);
    }
    public static int partition(ArrayList<Integer> A,int l, int r) {
        int i = l-1; int pivot = A.get(r);
        for(int j = 0; j <= r - 1; j++) {
            if(A.get(j) < pivot) {
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i+1,r);
        return i+1;

    }
    public static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j,temp);
    }
    public static void quickSort(ArrayList<Integer> A, int l, int r) {
        if(l < r) {
            int pi = partition(A,l,r);
            quickSort(A,l,pi-1);
            quickSort(A,pi+1,r);
        }
    }
}
