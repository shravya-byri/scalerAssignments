package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(9,8,7,6,5,4,3));
        mergeSort(A,0,A.size()-1);

    }
    public static void mergeSort(ArrayList<Integer> A, int l, int r) {
        if(l < r) {
            int mid = l + (r-l)/2;
            mergeSort(A,l,mid);
            mergeSort(A,mid+1,r);
            merge(A,l,mid,r);
        }
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> A,int l, int mid, int r) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < A.size(); i++) {
            ans.add(0);
        }
        int[] B = new int[A.size()];
        int i = l,j = mid+1, k = l;
        while(i <= mid-1 && j <= r) {
            if(A.get(i) <= A.get(j)) {
                B[k] = A.get(i);
                i++;
            } else {
                B[k] = A.get(j);
                j++;
            }
            k++;
        }
            while(j <= r) {
                B[k] = A.get(j);
                k++;
                j++;

            }
            while(i <= mid-1) {
                B[k] = A.get(i);
                k++;
                i++;

            }

        for(int m = l; m <= r; m++) {
            ans.set(m,B[m]);
        }
        return ans;
    }
}
