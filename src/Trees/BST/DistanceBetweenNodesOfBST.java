package Trees.BST;

import java.util.ArrayList;
import java.util.Collections;

public class DistanceBetweenNodesOfBST {
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
    ArrayList<Integer> l = new ArrayList<>();
    ArrayList<Integer> r = new ArrayList<>();
    public int lca(TreeNode A, int B, int C) {
        path(A,B,l);
        path(A,C,r);

        return l.size()+r.size()-2;
    }

    public static boolean path(TreeNode P, int Q,ArrayList<Integer> m){
        if(P == null) return false;
        if(P.val == Q) {
            m.add(P.val);
            return true;
        }
        if(path(P.left,Q,m) || path(P.right,Q,m)){
            m.add(P.val);
            return true;
        }
        return false;
    }
}
