package LinkedList;

public class test1 {
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(10));
    }

    public static int nextPerfectSquare(int N) {
        if(checkPerfectSquare(N)) return N;
        int nextN = (int) Math.floor(Math.sqrt(N)) + 1;

        return nextN * nextN;
    }
    static boolean checkPerfectSquare(int number)
    {

        double sqrt=Math.sqrt(number);

        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}
