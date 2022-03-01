package Trees;

import java.util.*;

public class VerticalLevelOrderTraversal {
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
    public static class CustomeNode{
        TreeNode node;
        int level;
        CustomeNode(TreeNode current, int lev) {
            node = current;
            level = lev;
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        Queue<CustomeNode> que = new LinkedList<>();
        que.add(new CustomeNode(A,0));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(!que.isEmpty()) {
            CustomeNode customnode = que.poll();
            TreeNode curr = customnode.node;
            int level = customnode.level;
            min = Math.min(min,level);
            max = Math.max(max,level);
            ArrayList<Integer> tempList = hm.getOrDefault(level, new ArrayList<>()); // it returns the value for the key if exists
            // else returns new value which is provided.
            // if(hm.containsKey(level))
            //                 tempList = hm.get(level);
            //            else
            //                tempList = new ArrayList<>();
            //
            //            tempList.add(entry.node.val);
            tempList.add(curr.val);
            hm.put(level,tempList);
            if(curr.left != null) {
                que.add(new CustomeNode(curr.left,level-1));
            }if(curr.right != null) {
                que.add(new CustomeNode(curr.right,level+1));
            }
        }
        while(min <= max) {
            res.add(hm.get(min));
            min++;
        }
        return res;
    }
}
