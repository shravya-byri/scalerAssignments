package Trees;

import java.util.*;

public class LevelOrder {
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
        public static ArrayList<ArrayList<Integer>> solve(TreeNode A) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            Queue<TreeNode> que = new LinkedList<>();
            que.add(A);
            que.add(null);
            ArrayList<Integer> t = new ArrayList<>();
            while(que.size() > 1) {
                TreeNode temp = que.peek();
                que.poll();
                if(temp == null) {
//                    System.out.println();
                    res.add(t);
                    t = new ArrayList<>();
                    que.add(null);
                    continue;
                }
//                System.out.print(temp.val + " ");
                t.add(temp.val);
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }
            res.add(t);
          return res;
        }
    }

