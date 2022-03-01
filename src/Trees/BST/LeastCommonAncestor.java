package Trees.BST;

import Trees.LevelOrder;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static java.util.Collections.reverse;

public class LeastCommonAncestor {
    public static  ArrayList<Integer> l = new ArrayList<>();
    public static  ArrayList<Integer> r = new ArrayList<>();
    public static class TreeNode{
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
        TreeNode A = new TreeNode(3);
        A.left = new TreeNode(1);
        A.right = new TreeNode(1);
        A.left.left = new TreeNode(7);
        A.left.right = new TreeNode(8);
        A.right.left = new TreeNode(9);
        A.right.right = new TreeNode(0);
        A.right.right.left = new TreeNode(11);

        System.out.println(lca(A,1,1));

    }
    public static int lca(TreeNode A, int B, int C) {

           path(A,B,l);
           path(A,C,r);
       Collections.reverse(l);
       Collections.reverse(r);
          int ans = -1;
          int i;
          for( i = 0; i < l.size() && i < r.size(); i++) {
            if(!l.get(i).equals(r.get(i))) {
              ans = l.get(i-1);
              break;
            }
        }
        if(ans == -1 && i > 0) {
            if(l.get(i-1).equals(r.get(i-1))) {
                ans = l.get(i-1);
            }
        }
        return ans;
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
