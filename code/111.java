class Solution {
    int answer;
    
    void traversal(TreeNode root, int depth){
        if(root == null)
            return;
        
        if(root.left == null && root.right == null){
            if(answer > depth)
                answer = depth;
            return;
        }
        
        traversal(root.left, depth + 1);
        traversal(root.right, depth + 1);
    }
        
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        answer = Integer.MAX_VALUE;
        
        traversal(root, 1);
        
        return answer;
    }
}