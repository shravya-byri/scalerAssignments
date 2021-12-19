package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(12,11,13,5,6,7));
        mergeSort3(A,0,A.size()-1);
        System.out.println(A);
    }
    public static void mergeSort3(ArrayList<Integer> A, int l, int r) {
        if(l < r) {
            int mid = l + (r - l)/2;
            mergeSort3(A,l,mid);
            mergeSort3(A,mid+1,r);
            merge3(A,l,mid,r);
        }

    }
    public static void merge3(ArrayList<Integer> A,int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L1 = new int[n1];
        int[] R1 = new int[n2];
        for(int i = 0; i < n1; i++) {
            L1[i] = A.get(l+i);
        }
        for(int j = 0; j < n2; j++) {
            R1[j] = A.get(mid+1+j);
        }
        int i = 0; int j = 0; int k = l;
        while(i < n1 && j < n2) {
            if(L1[i] < R1[j]){
                A.set(k,L1[i]);
                k++;
                i++;
            } else {
                A.set(k,R1[j]);
                j++;
                k++;
            }
        }
        while (i < n1) {
            A.set(k,L1[i]);
            i++;
            k++;
        }
        while (j < n2) {
            A.set(k,R1[j]);
            j++;
            k++;
        }
    }
}
