package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreaterThantwo {
    public static void main(String[] args) {
        ArrayList<Integer>  A = new ArrayList<>(List.of(391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int FirstG = Integer.MIN_VALUE;
        int secG = Integer.MIN_VALUE;
        for(int i = 0; i <  A.size(); i++) {
            if(A.get(i) > FirstG) {
                secG = FirstG;
                FirstG = A.get(i);
            } else{
                if(A.get(i) > secG) {
                    secG = A.get(i);
                }
            }
        }
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) != FirstG && A.get(i) != secG) {
            res.add(A.get(i));
           }
        }

        return res;
    }
}
