package Sorting;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(2,12,11,13,5,6,7));

        System.out.println( mergeSort3(A,0,A.size()-1));
    }
    public static int mergeSort3(ArrayList<Integer> A, int l, int r) {
        int count = 0;
        int x = 0, y = 0, z = 0;
        if(l < r) {
            int mid = l + (r - l)/2;
             x =  mergeSort3(A,l,mid);
             y = mergeSort3(A,mid+1,r);
             z =  merge3(A,l,mid,r,count);
        }
        return x + y + z;

    }
    public static int merge3(ArrayList<Integer> A,int l, int mid, int r, int count) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L1 = new int[n1];
        int[] R1 = new int[n2];
        for (int i = 0; i < n1; i++) {
            L1[i] = A.get(l + i);
        }
        for (int j = 0; j < n2; j++) {
            R1[j] = A.get(mid + 1 + j);
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L1[i] < R1[j]) {
                A.set(k, L1[i]);
                k++;
                i++;
            } else {
                if(L1[i] > 2 * R1[j]) {
                    count = count + (n1 - i);
                }
                A.set(k, R1[j]);
                j++;
                k++;
            }
        }
        while (i < n1) {
            A.set(k, L1[i]);
            i++;
            k++;
        }
        while (j < n2) {
            A.set(k, R1[j]);
            j++;
            k++;
        }
        return count;
    }
}
