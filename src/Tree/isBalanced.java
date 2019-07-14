package Tree;

import javax.swing.tree.RowMapper;
import java.util.Stack;

public class isBalanced {

    public int getChildTreeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int i = getChildTreeHeight(root.left);
        int j = getChildTreeHeight(root.right);
        return (i < j) ? j+1 :i + 1;
    }

    public boolean isBalanced(TreeNode treeNode){
        int diff = 0;
        if(treeNode == null){
            return true;
        };
        if(treeNode.left == null && treeNode.right == null){
            return true;
        }
        System.out.println(getChildTreeHeight(treeNode.left));
        System.out.println(getChildTreeHeight(treeNode.right));
        diff = Math.abs(getChildTreeHeight(treeNode.left) - getChildTreeHeight(treeNode.right));
        if(diff <= 1){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(5);

        root.left = root1;
        root.right = root2;

        root2.left = root4;
        isBalanced isBalanced = new isBalanced();
        System.out.println(isBalanced.isBalanced(root));

    }



}
