package Arithmetic.BitManupulation;

import java.util.Locale;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A= "100";
        String B= "11";
        System.out.println(solve(A,B));
    }
    public static int solve(String A,String B) {
        int flag = 0;
        int str = 0;
        int i = B.length()-1;
        int j = A.length()-1;
        int[] res = new int[A.length()+1];
        while(i > 0){
            if(B.charAt(i) == '0' && B.charAt(i) == A.charAt(j)) {
                i--;
                j--;
            } else if(B.charAt(i) == 1 && B.charAt(i) == A.charAt(j)) {
                flag = 1;

            }



        }
        return 0;
    }
}
