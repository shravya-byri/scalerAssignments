package Trees.BST;

public class BSTNodesInARange {
    static int count;
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
        System.out.println(solve(A, 5, 10));
    }
    public static int solve(TreeNode A, int B, int C) {
         count = 0;
         count1(A,B,C);
         return count;
    }
    public static void count1(TreeNode A, int B, int C) {
            if(A == null) return ;

           if(A.val <= C && A.val >= B )
               count++;
            count1(A.left,B,C);
            count1(A.right,B,C); //here count is pass by value
    }
}
