package Sorting;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(121, 839, 643, 713, 837, 39, 273, 130, 400, 864, 415, 2, 19, 291, 117, 812, 617, 185, 160, 597, 542, 555, 231, 49, 600, 543, 233, 847, 350, 392, 572, 592, 415, 282, 190, 608, 501, 491, 880, 579, 47, 258, 977, 593, 282, 491, 77, 532, 987, 309, 999, 740, 735, 322, 823, 149, 514, 874, 558, 7, 178, 964, 38, 227, 927, 299, 262, 914, 622, 675, 490, 355, 154, 392, 957, 703, 217, 648, 758, 456, 433, 119, 784, 563, 876, 700, 851, 698, 126, 406, 266, 150, 746, 883, 369, 859, 717, 848, 160, 98, 869, 58, 792, 172, 80, 974, 522, 738, 159, 407, 917, 397, 458, 687, 838, 506, 83, 116, 967, 779, 698, 877, 739, 321, 573, 257, 716, 413, 57, 135, 342, 860, 17, 820, 675, 182, 752, 674, 62, 43, 127, 412, 663, 81, 494, 399, 586, 48, 78, 498, 802, 201, 164, 332, 371, 540, 677, 754, 321, 195, 952, 334, 801, 628, 486, 455, 520, 164, 259, 616, 326, 339, 202, 711, 62, 443, 696, 633, 591, 507, 26, 853, 402, 359, 363, 177, 489, 484, 537, 630, 381, 253, 184, 438, 925, 635, 219, 168, 880, 2, 65, 253, 923, 30, 775, 206, 382, 436, 844, 904, 556, 144, 329));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int count = 0;
        System.out.println(A);
        for (int i = 1; i < A.size(); i++) {
            if(Objects.equals(A.get(i), A.get(i - 1))){
                A.set(i,A.get(i)+1);
                count++;
            } if(A.get(i) < A.get(i-1)) {
                int diff = A.get(i-1) - A.get(i)+1;
                A.set(i,A.get(i)+diff);
                count += diff;
            }
        }
        System.out.println(A);
      return count;
    }
}
