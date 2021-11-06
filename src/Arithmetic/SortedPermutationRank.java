package Arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class SortedPermutationRank {
    public static void main(String[] args) {
        String S = "gTFAMYjxCewRlftmGOKJHUuhSBVDZnbqyoPQadEkLrpNsv";
        System.out.println(solve(S));
    }
    public static int solve(String A) {
        int res = 0;
       // A = A.toLowerCase(Locale.ROOT);
        ArrayList<Character> array = new ArrayList<Character>();
        for(int i = 0; i < A.length(); i++) {
            array.add(A.charAt(i));
        }
        //char[] array = A.toCharArray();
       // Arrays.sort(array);
        Collections.sort(array);
       int length = array.size();
        int i = 0, j = 0;
        int ans = 0;
        while(i < A.length() && j < A.length()) {
            if(array.get(i) == A.charAt(j)) {
                array.remove(i);
                j++;
                i = 0;
            } else {
                int n = length - 1 - j ;
                ans = ans + (factorial(n));
                i++;
            }
        }


        return (ans+1) % 1000003;
    }
    public static int factorial(int n) {
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000003;

        }
        int fac = (int) (ans % 1000003);
        return fac;
    }
}
