package Trees;

public class DiameterOfABinaryTree {
    public static void main(String[] args) {

    }
        int diameter = 0;
    public int solve(TreeNode A) {
            height(A);
            return diameter;
    }

    public int height(TreeNode A) {
            if(A == null) return -1;
            int l = height(A.left);
            int r = height(A.right);
            diameter = Math.max(diameter, l+r+2);
            return Math.max(l,r)+1;
    }

}
