package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4,2,1,6,3,4,1));
        quickSort(A,0,A.size()-1);
        System.out.println(A);
    }
    public static void quickSort(ArrayList<Integer> A,int l,int r) {
        if(l >= r) return;
        int ind = reArrange(A,l,r);
        quickSort(A,l,ind-1);
        quickSort(A,ind+1,r);


    }
    public static int reArrange(ArrayList<Integer> A, int l, int r) {
        int p1 = l+1; int p2 = r;
        while(p1 <= p2) {
            if(A.get(p1) <= A.get(l)) {
                p1++;
            }else if(A.get(p2) > A.get(l)) {
                p2--;
            } else  {
                swap(A,p1,p2);
                p1++;
                p2--;
            }
        }
        swap(A,l,p1-1);
        return p1-1;
    }
    public static void swap(ArrayList<Integer> A,int i, int j) {
        int temp = A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);
    }
}
