package Trees;

import com.sun.source.tree.Tree;

public class HeightOfTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    public static int solve(TreeNode A) {
        if(A == null) return 0;
        int l = solve(A.left);
        int r = solve(A.right);
        return Math.max(l,r)+1;
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(4);
        A.left = new TreeNode(5);
        A.right = new TreeNode(6);
        A.left.left = new TreeNode(7);
        A.left.left.left = new TreeNode(8);
        System.out.println(solve(A));

    }
}
