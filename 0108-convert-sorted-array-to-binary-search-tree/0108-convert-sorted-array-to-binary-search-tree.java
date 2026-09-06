class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildtree(nums,0,nums.length-1);
    }
    private TreeNode buildtree(int[] nums,int left,int right ){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=buildtree(nums,left,mid-1);
        node.right=buildtree(nums,mid+1,right);
        return node;
    }
}
