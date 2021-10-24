import java.util.ArrayList;
import java.util.List;

public class RainWaterTrapped {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A){
        int res = 0;
        if(A.size() < 3) return 0;
        ArrayList<Integer> rightHeight = new ArrayList<>();
        int maxRightHeight = Integer.MIN_VALUE;
        for(int i = A.size()-1; i >= 0; i--) {
            if(A.get(i) > maxRightHeight){
                maxRightHeight = A.get(i);
            }
            rightHeight.add(maxRightHeight);
        }
        ArrayList<Integer> leftHeight = new ArrayList<>();
        int maxLeftHeight = Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) > maxLeftHeight){
                maxLeftHeight = A.get(i);
            }
            leftHeight.add(maxLeftHeight);
        }
        for(int i = 0; i < A.size();i++) {
            res = res + Math.min(leftHeight.get(A.size()-i-1),rightHeight.get(i)) - A.get(i);
        }



       System.out.println(rightHeight);
        System.out.println(leftHeight);

        return res;
    }
}
