class Solution {
    int sum = 0;
    
    void sumNode(TreeNode tree){
        if(tree.left != null){
            if(tree.left.left != null)
                sum += tree.left.left.val;
            if(tree.left.right != null)
                sum += tree.left.right.val;
        }
        
        if(tree.right != null){
            if(tree.right.left != null)
                sum += tree.right.left.val;
            if(tree.right.right != null)
                sum += tree.right.right.val;
        }
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            
            if(temp.left != null)
                q.offer(temp.left);
            if(temp.right != null)
                q.offer(temp.right);
            
            if(temp.val % 2 == 0)
                sumNode(temp);
        }
        
        return sum;
    }
}
