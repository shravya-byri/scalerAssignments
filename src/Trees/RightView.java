package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {
    public static class TreeNode {
        int val;
        LeftView.TreeNode left;
        LeftView.TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        LeftView.TreeNode A = new LeftView.TreeNode(4);
        A.left = new LeftView.TreeNode(5);
        A.right = new LeftView.TreeNode(6);
        A.left.left = new LeftView.TreeNode(7);
        A.left.right = new LeftView.TreeNode(8);
        A.right.left = new LeftView.TreeNode(9);
        A.right.right = new LeftView.TreeNode(0);

        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(LeftView.TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<LeftView.TreeNode> que = new LinkedList<>();
        res.add(A.val);
        que.add(A);
        que.add(null);

        while (que.size() > 1) {
            LeftView.TreeNode temp = que.peek();
            que.poll();
            if (temp == null) {
//                    System.out.println();
                res.add(que.peek().val);
                que.add(null);
                continue;
            }
//                System.out.print(temp.val + " ");
            if (temp.right != null) que.add(temp.right);
            if (temp.left != null) que.add(temp.left);
        }

        return res;
    }
}
