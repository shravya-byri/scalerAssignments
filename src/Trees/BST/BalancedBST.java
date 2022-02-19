package Trees.BST;

import Trees.LeftView;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BalancedBST {
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
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5,6));
        solve(A);
    }
    public static TreeNode solve(ArrayList<Integer> A) {
        if(A.size() < 2) return new TreeNode(A.get(0));
        TreeNode root = construct(A,0,A.size()-1);
        return root;
    }
    public static TreeNode construct(ArrayList<Integer> A, int start,int end) {
        if(start > end) return null;
        int mid = (start + end)/2;
        TreeNode newNode = new TreeNode(A.get(mid));
        newNode.left = construct(A,start, mid-1);
        newNode.right = construct(A,mid+1,end);
        return newNode;
    }
}
