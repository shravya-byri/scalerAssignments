package Trees.BST;

import java.util.ArrayList;

public class RestoreBST {
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
    public static TreeNode first = null;
    public static TreeNode sec = null;
    public static TreeNode prev = null;
    public static void main(String[] args) {
        TreeNode A = new TreeNode(4);
        A.left = new TreeNode(5);
        A.right = new TreeNode(6);
        A.left.left = new TreeNode(7);
        A.left.right = new TreeNode(8);
        A.right.left = new TreeNode(9);
        A.right.right = new TreeNode(0);

        findSwapped(A);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(sec.val);
        ans.add(first.val);
    }
    public static void findSwapped(TreeNode A) {
        if(A == null) return;
        findSwapped(A.left);
        if(prev != null && prev.val > A.val){
            if(first == null) first = prev;
            sec = A;
        }
        prev = A;
        findSwapped(A.right);

    }
}
