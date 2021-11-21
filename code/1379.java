class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode temp = cloned, answer = new TreeNode();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(temp);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            
            if(cur.val == target.val){
                answer = cur;
                break;
            }
            
            if(cur.left != null)
                q.offer(cur.left);
            if(cur.right != null)
                q.offer(cur.right);
        }
        
        return answer;
    }
}
