package RecursionAndBackTracking;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(71045970,41535484,64735492));
    }
    public static int pow(int A, int B, int C) {
        if(A == 0) return 0;
        if(B == 0) return 1;
        long x = (long)pow(A, B/2, C)%C;
        long halfRes = ((x % C) * (x % C)) % C;

        if(B % 2 == 0) return (int)halfRes;
        return (int)(((halfRes *(A % C))%C + C)%C) % C;
    }
}
