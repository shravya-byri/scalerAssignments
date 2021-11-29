package Searching;

import java.util.ArrayList;
import java.util.List;

public class MedianArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer> b = new ArrayList<>(List.of(7,8,9));
        System.out.println(findMedianSortedArrays(a,b));
    }
    public static double findMedianSortedArrays(ArrayList<Integer> a, ArrayList<Integer> b) {
        if(b.size() < a.size()) return findMedianSortedArrays(b,a);
        int n1 = a.size();
        int n2 = b.size();
        int low = 0; int high = n1;
        while(low <= high) {
            int cut1 = low + ((high - low)/2);
            int cut2 = (n2 + n1 + 1)/2 - cut1;
            int left1 = cut1 == 0 ? Integer.MIN_VALUE : a.get(cut1-1);
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : b.get(cut2-1);

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : a.get(cut1);
            int right2 = cut2 == n2 ? Integer.MAX_VALUE : b.get(cut2);
            if(left1 <= right2 && left2 <= right1) {
                if( (n1 + n2) % 2 == 0 )
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                else
                    return Math.max(left1, left2);
            }
            else if(left1 > right2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0.0;



    }
}
