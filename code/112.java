class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        
        Queue<TreeNode> q = new LinkedList();
        Queue<Integer> s = new LinkedList();
        
        q.offer(root);
        s.offer(0);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            int tempSum = s.poll() + temp.val;
            
            if(tempSum == sum && temp.left == null && temp.right == null)
                return true;
            
            if(temp.left != null){
                q.offer(temp.left);
                s.offer(tempSum);
            }
            
            if(temp.right != null){
                q.offer(temp.right);
                s.offer(tempSum);
            }
        }
        
        return false;
    }
}