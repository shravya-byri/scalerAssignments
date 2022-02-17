package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
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

        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        res.add(A.val);
        que.add(A);
        que.add(null);

        while (que.size() > 1) {
            TreeNode temp = que.peek();
            que.poll();
            if (temp == null) {
//                    System.out.println();
                res.add(que.peek().val);
                que.add(null);
                continue;
            }
//                System.out.print(temp.val + " ");
            if (temp.left != null) que.add(temp.left);
            if (temp.right != null) que.add(temp.right);
        }

        return res;
    }

}
