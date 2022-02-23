package Trees.BST;

import java.util.ArrayList;
import java.util.Objects;

public class CommonNodesInTwoBST {
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

        TreeNode B = new TreeNode(4);
        B.left = new TreeNode(5);
        B.right = new TreeNode(6);
        B.left.left = new TreeNode(7);
        B.left.right = new TreeNode(8);
        B.right.left = new TreeNode(9);
        B.right.right = new TreeNode(0);

        System.out.println(solve(A,B));

    }
    public static int solve(TreeNode A, TreeNode B) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        first = inOrderTraversal(A, first);
        second = inOrderTraversal(B,second);
        int x = 0; int y = 0;
        long sum = 0;
        while(x < first.size() && y < second.size()) {
           if(Objects.equals(first.get(x), second.get(y))) {
               sum = sum + first.get(x);
               x++; y++;
           } else if(first.get(x) < second.get(y)) {
               x++;
           } else y++;
       }
        return  (int)( sum + sum ) % 1000000007;
    }
    public static ArrayList<Integer> inOrderTraversal(TreeNode A, ArrayList<Integer> res) {
        if(A == null) return res;
        inOrderTraversal(A.left,res);
        res.add(A.val);
        inOrderTraversal(A.right,res);
        return res;

    }
}
