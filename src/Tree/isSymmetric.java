package Tree;

public class isSymmetric {
    public boolean isSymmetrice(TreeNode root){
        return isMirror(root,root);
    }


    public boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 ==null){
            return false;
        }


        return t1.val == t2.val && isMirror(t1.left,t2.right) && isMirror(t1.right,t1.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leaf = new TreeNode(2);
        TreeNode leaf1 = new TreeNode(2);
        root.left = leaf;
        root.right = leaf1;
        TreeNode leaf2 = new TreeNode(3);
        TreeNode leaf2_2 = new TreeNode(3);
        TreeNode leaf3 = new TreeNode(4);
        TreeNode leaf4 = new TreeNode(4);
        leaf.left = leaf2;
        leaf1.left = leaf2_2;
        leaf.right = leaf3;
        leaf1.right = leaf4;
        boolean flag = new isSymmetric().isSymmetrice(root);

        System.out.println(flag);
    }
}
