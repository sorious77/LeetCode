class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null) {
            return true;
        }
        
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean isBST(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }
        
        if((root.left != null && root.left.val >= root.val) || (root.right != null && root.right.val <= root.val)) {
            return false;
        }
        
        if(root.val <= min || root.val >= max) {
            return false;
        }
        
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
}
