package Trees;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }

public class InvertTree {
    public class Solution {
        public TreeNode invertTree(TreeNode A) {
            if(A==null){
                return A;
            }
            TreeNode temp=A.left;
            A.left=A.right;
            A.right=temp;
            invertTree(A.left);
            invertTree(A.right);
            return A;
        }
    }

}
