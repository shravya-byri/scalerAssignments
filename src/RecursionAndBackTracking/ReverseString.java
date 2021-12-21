package RecursionAndBackTracking;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        //String A = "shravya";
         String ans = "";
         int i = str.length()-1;
         System.out.println(solve(str,ans,i));
    }
    public static String solve(String A, String ans, int i) {
        if(i == -1) return ans;
        else return solve(A,ans + A.charAt(i),i-1);


    }
}
