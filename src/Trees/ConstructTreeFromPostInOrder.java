package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConstructTreeFromPostInOrder {
    public static class TreeNode{
        int val;
        ConstructTreefromPreInOrder.TreeNode left;
        ConstructTreefromPreInOrder.TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> post0rder = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> inOrder = new ArrayList<>(List.of(2, 1, 3));
        HashMap<Integer,Integer> hmInorder = new HashMap<>();
        for(int i = 0; i < inOrder.size();i++){

            hmInorder.put(inOrder.get(i),i );
        }
        buildTree(post0rder,inOrder,0, post0rder.size()-1, 0, inOrder.size()-1,hmInorder);


    }
    public static ConstructTreefromPreInOrder.TreeNode buildTree(ArrayList<Integer> postOrder, ArrayList<Integer> inOrder, int pos, int poe, int ins, int ine, HashMap<Integer,Integer> hmInorder) {
        if (pos > poe) return null;
        ConstructTreefromPreInOrder.TreeNode temp = new ConstructTreefromPreInOrder.TreeNode(postOrder.get(poe));
        int ind;
        ind = hmInorder.get(postOrder.get(poe));

//       for(int i = ins; i<= ine; i++) {
//           if(inOrder.get(i) == preOrder.get(pos)) {
//               ind = i;
//               break;
//           }
//
//       }
        int x = ind - ins;
        temp.left = buildTree(postOrder, inOrder, pos, pos + x-1, ins, ind - 1, hmInorder);
        temp.right = buildTree(postOrder, inOrder, pos + x , poe-1, ind + 1, ine, hmInorder);
        return temp;
    }
}
