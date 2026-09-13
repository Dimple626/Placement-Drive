
class Solution {
    public int maxLevelSum(TreeNode root) {
          if(root==null) return 0;
        int maxi=root.val; 
        int index=0;   
        Queue<TreeNode> q=new LinkedList<>();
      
      
        int k=1;
        q.add(root);   
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            }
            index++;
            if(maxi<sum){
                maxi=sum;
                k=index;
            }
          
          
        } 
        return k;
    }
}
