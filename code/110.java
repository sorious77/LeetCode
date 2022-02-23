class Solution {
    boolean answer = true;
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        return (Math.abs(getBalance(root.left, 0) - getBalance(root.right, 0)) <= 1 && answer);
    }
    
    int getBalance(TreeNode root, int level) {
        if(root == null || !answer) {
            return level;
        }
        
        int left = getBalance(root.left, level + 1);
        int right = getBalance(root.right, level + 1);
        
        if(Math.abs(left - right) >= 2) {
            answer = false;
        }
        
        return Math.max(left, right);
    }
}
