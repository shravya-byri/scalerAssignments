package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClosestPoints {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        a.add(new ArrayList<>(List.of(1, 2)));
        a.add(new ArrayList<>(List.of(2, 3)));
        a.add(new ArrayList<>(List.of(0, 1)));
        a.add(new ArrayList<>(List.of(-1, -1)));
        System.out.println(solve(a, 3));

    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> a, int b) {
        Collections.sort(a, new CordinateComparator());
        System.out.println(a);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i <b; i++) {
            res.add(a.get(i));
        }
        return res;
    }
    public static Double getEuclideanDistanceFromOrigin(ArrayList<Integer> coordinates) {
        return Math.sqrt((coordinates.get(0) * coordinates.get(0)) + (coordinates.get(1) * coordinates.get(1)));
    }
    static class CordinateComparator implements Comparator<ArrayList<Integer>> {

        @Override
        public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
            double aDist = getEuclideanDistanceFromOrigin(a);
            double bDist = getEuclideanDistanceFromOrigin(b);
            if (aDist > bDist) return 1;
            else return -1;
        }
    }

}
