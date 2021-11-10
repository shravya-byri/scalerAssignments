package Arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllGCDPairs {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4));
       System.out.println( findNumbers(A));
    }
       public static ArrayList<Integer> findNumbers(ArrayList<Integer> A){
        int arr[] = new int[A.size()];
            for(int i = 0; i < A.size(); i++) {
                arr[i] = A.get(i);

            }
            int n = A.size();
            Arrays.sort(arr);
            reverse(arr);
            int freq[] = new int[arr[0] + 1];

            for (int i = 0; i < n; i++) {
                freq[arr[i]]++;
            }
            int size = (int) Math.sqrt(n);
            int brr[] = new int[size], x, l = 0;

            for (int i = 0; i < n; i++) {
                if (freq[arr[i]] > 0 && l < size) {
                    brr[l] = arr[i];
                    freq[brr[l]]--;
                    l++;
                    for (int j = 0; j < l; j++) {
                        if (i != j) {
                            x = gcd(arr[i], brr[j]);
                            freq[x] -= 2;
                        }
                    }
                }
            }
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i < size; i++){
                res.add(brr[i]);
            }

            return res;
        }

        public static void reverse(int[] input){
            int last = input.length - 1;
            int middle = input.length / 2;
            for (int i = 0; i <= middle; i++) {
                int temp = input[i];
                input[i] = input[last - i];
                input[last - i] = temp;
            }
        }

       public static int gcd(int a,int b){
            if (b == 0) {
                return a;
            }
            return gcd(b,a % b);

        }


}
