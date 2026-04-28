/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     TreeNode first;
      TreeNode second;
       TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        
        
        iot(root);

        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    private void iot(TreeNode node){
        if(node==null) return;
        iot(node.left);
            if(prev!=null && prev.val>node.val){
                if(first==null){
                    first=prev;
                }
                second=node;
            }
            prev=node;
            iot(node.right);
        }
    }

