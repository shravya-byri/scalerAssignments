package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(9,8,7,6,5,4,3));
        mergeSort(A,0,A.size()-1);
    }
    public static void mergeSort(ArrayList<Integer> A, int l, int r) {
        int[] temp = new int[A.size()];
        if(l < r) {
            int mid = l + (r-l)/2;
            mergeSort(A,l,mid);
            mergeSort(A,mid+1,r);
            merge(A,temp,l,mid,r);
        }
    }
   public static long merge(ArrayList<Integer> A, int[] temp,int left, int mid, int right) {
        int[] arr = new int[A.size()];
        for(int i = 0; i < A.size(); i++) {
            arr[i] = A.get(i);
        }
        int i, j, k;
         long inv_count = 0;
        i = left;
        j = mid;
        k = left;
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }


        while (i <= mid - 1)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i];
        return inv_count % (int)Math.pow(10,9)+7;
    }






}
