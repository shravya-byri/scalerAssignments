package Arithmetic.BitManupulation;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(solve(20));
    }
    public static int solve(int A) {
        int sum = 0;
        for(int i = 0; i < 31; i++) {
            int m = A+1;
            int x = (A+1)/(1 <<(i+1));
            if(x >= 0){
                int y = (m >> (i+1)) * (1 << i);
                int z = (m % (1 << (i+1)));
                if(z > (1 << i)) {
                    z = z - (1 << i);
                } else z = 0;
                sum = sum + y + z;
            }
        }
        return sum;
    }
}
