package Arithmetic;

public class VeryLargePower {
    public static void main(String[] args) {
        int A = 2;
        int B = 27;
        System.out.println(solve(A,B));
    }
    public static int solve(int A,int B) {
        long fac = 1;
        long res = 1;
        for(int i = 1; i <= B; i++) {
            fac = (fac * i) % (int)((Math.pow(10,9))+6);
        }
        fac = fac % (int)((Math.pow(10,9))+6);
        A = A % (int)((Math.pow(10,9))+7);
        long D =A;
        while(fac > 0) {
            if(fac % 2 == 0) {
                D = (D*D) % (int)((Math.pow(10,9))+7);
                fac =fac/2;
            } else {
                res = (res * D) % (int)((Math.pow(10,9))+7);
                D = (D*D) % (int)((Math.pow(10,9))+7);
                fac = (fac-1)/2;
            }

        }
       return (int)res;

    }
}
