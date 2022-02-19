package Trees.BST;

import Trees.LeftView;

public class IsValid {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode A = new TreeNode(4);
        A.left = new TreeNode(5);
        A.right = new TreeNode(6);
        A.left.left = new TreeNode(7);
        A.left.right = new TreeNode(8);
        A.right.left = new TreeNode(9);
        A.right.right = new TreeNode(0);

        System.out.println(isValidBST(A,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
    public static int isValidBST(TreeNode A, int l, int r) {
        if(A == null) return 1;
        if(l <= A.val && A.val <= r) {
            int x = isValidBST(A.left,l,A.val-1);
            int y = isValidBST(A.right,A.val+1,r);
            return x & y;
        }
        return 0;
    }
}
