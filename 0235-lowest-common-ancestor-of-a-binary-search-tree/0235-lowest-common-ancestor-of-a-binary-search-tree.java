
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || p==root|| q==root) return root;
        TreeNode leftchild=lowestCommonAncestor(root.left,p,q);
         TreeNode rightchild=lowestCommonAncestor(root.right,p,q);
         if(leftchild==null){
            return rightchild;
         }else if(rightchild==null){
            return leftchild;
         }else{
            return root;
         }
    }
}



