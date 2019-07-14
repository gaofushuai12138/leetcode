package Tree;

public class minDepth {



    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return minDepth(root.right)+1;
        }else if(root.right == null){
            return minDepth(root.left)+1;
        }

        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(0);
        TreeNode leaf = new TreeNode(1);

        root.left = leaf;


        System.out.println(new minDepth().minDepth(root));
    }
}
