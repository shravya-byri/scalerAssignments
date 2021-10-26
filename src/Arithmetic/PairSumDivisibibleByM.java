package Arithmetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PairSumDivisibleByM {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(5, 17, 100, 11));
        int B =28;
        System.out.println(solve(A,B));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        long res = 0;
        int rem;
        HashMap<Integer,Integer> reminders = new HashMap<>();
        for(int i = 0; i < A.size(); i++) {
            rem = A.get(i) % B;
            if(reminders.get(rem) == null) reminders.put(rem,1);
            else reminders.put(rem,reminders.get(rem)+1);
        }
        for( Integer key : reminders.keySet() ) {
            if(key == 0) {
                res = (long) reminders.get(key) * (reminders.get(key) -1);
            } else if(B%2 == 0 && key == B/2){
                res = res + (long) reminders.get(key) * (reminders.get(key)-1);
            } else{
                if(reminders.get(key) != null && reminders.get(B-key) != null)
                res = res + ((long) reminders.get(key) * reminders.get(B-key));
            }
        }

        res =res/2;
        return (int) res % (int)(Math.pow(10,9)+7);
    }
}
