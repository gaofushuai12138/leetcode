package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                res.add((cur.val));
                cur = cur.right;
            }
        }
        return res;
    }
}
