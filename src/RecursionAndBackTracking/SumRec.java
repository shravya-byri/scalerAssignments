package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class SumRec {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3, 4 ,5 ));
        int sum = 0; int i = 0;
        System.out.println(sum(a,sum,i));
    }
    public static int sum(ArrayList<Integer> a,int sum,int i) {

        if(i == a.size()) return sum;
        else  return sum(a,sum+ a.get(i),i+1);

    }
}
