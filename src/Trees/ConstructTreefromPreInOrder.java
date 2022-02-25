package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConstructTreefromPreInOrder {
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
        ArrayList<Integer> pre0rder = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> inOrder = new ArrayList<>(List.of(2, 1, 3));
        HashMap<Integer,Integer> hmInorder = new HashMap<>();
        for(int i = 0; i < inOrder.size();i++){
            hmInorder.put(inOrder.get(i),i );
        }
        buildTree(pre0rder,inOrder,0, pre0rder.size()-1, 0, inOrder.size()-1,hmInorder);

    }
    public static TreeNode buildTree(ArrayList<Integer> preOrder,ArrayList<Integer> inOrder,int prs,int pre,int ins,int ine,HashMap<Integer,Integer> hmInorder) {
      if(prs >pre) return null;
       TreeNode temp = new TreeNode(preOrder.get(prs));
       int ind ;
       ind = hmInorder.get(preOrder.get(prs));

//       for(int i = ins; i<= ine; i++) {
//           if(inOrder.get(i) == preOrder.get(prs)) {
//               ind = i;
//               break;
//           }
//
//       }
       int x = ind - ins;
       temp.left = buildTree(preOrder,inOrder,prs+1,prs+x,ins,ind-1,hmInorder);
       temp.right = buildTree(preOrder,inOrder,prs+x+1,pre,ind+1,ine,hmInorder);
       return temp;
    }
}
