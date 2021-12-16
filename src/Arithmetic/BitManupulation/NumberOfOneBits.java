package Arithmetic.BitManupulation;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(solve(num));
    }
    public static int solve(int num) {
        int count = 0;
        while(num > 0) {
            if((num & 1) == 1) {
                count++;
            }
            num = num >> 1;

        }
            return count;
    }
}
