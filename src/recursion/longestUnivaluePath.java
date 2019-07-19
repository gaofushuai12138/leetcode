package recursion;

import Tree.TreeNode;

public class longestUnivaluePath {

    public int longestUnivaluePath(TreeNode root) {
        int length = 0;
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null)
        if(root.left.val == root.val ){
            longestUnivaluePath(root.left);
        }
        if(root.right.val == root.val){
            longestUnivaluePath(root.right);
        }
        int left = longestUnivaluePath(root.left);
        int right = longestUnivaluePath(root.right);
        return left > right ? left + 1 : right + 1;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(0);
        root.left = left;
        root.right = right;

        System.out.println(new longestUnivaluePath().longestUnivaluePath(root));
    }
}
