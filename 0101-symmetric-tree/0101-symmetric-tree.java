
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return ismirror(root.left,root.right);
    }
    private boolean ismirror(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null ||q==null) return false;
        if(p.val!=q.val) return false;
        return ismirror(p.left,q.right)&& ismirror(p.right,q.left);
    }
}