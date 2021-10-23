import java.util.ArrayList;
import java.util.List;

public class AddOneToNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 0,0,0,0,0,0, 3, 7, 6, 4, 0, 5, 5, 5));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int m = 0;
        while(A.get(m) == 0){
            if(A.get(m) == 0) A.remove(m);
            m = 0;
        }
        reverseArray(A);
        int carry = 0;
        if(A.get(0) == 9) {
            A.set(0,0);
            carry = 1;
        } else A.set(0,A.get(0)+1);
        for(int i = 1; i < A.size(); i++) {

            A.set(i,A.get(i)+carry);
            if(A.get(i) >= 10) {
                carry = 1;
                A.set(i,A.get(i)%10);
            } else carry = 0;

        }
        if(carry == 1) A.add(1);
        reverseArray(A);
        return A;
    }
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> A) {
        for(int i = 0; i < A.size()/2; i++) {

            int temp;
            temp = A.get(i);
            A.set(i, A.get(A.size()-i-1));
            A.set((A.size()-i-1), temp);

        }
        System.out.println(A);
        return A;
    }
}
