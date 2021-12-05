class Solution {
    boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        } else if(left == null || right == null) {
            return false;
        }        
        
        if(left.val != right.val) {
            return false;         
        }
        
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }
}
