package Trees.BST;

import java.util.ArrayList;

public class KthSmallestElement {
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
    public static  int count = 0;
    public static void main(String[] args) {
        TreeNode A = new TreeNode(4);
        A.left = new TreeNode(2);
        A.right = new TreeNode(6);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(3);
        A.right.left = new TreeNode(5);
        A.right.right = new TreeNode(10);
        getKthnode(A,2);
    }
    public static int getKthnode(TreeNode A, int B) {
        count = B;
        solve(A);
        return A.val;
    }
    public static void solve(TreeNode A) {
        if(A == null) return ;
        if(count > 0) {
            solve(A.left);
            count--;
            solve(A.right);
        }


    }
}
