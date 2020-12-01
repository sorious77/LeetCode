class Solution {
    int result = 0;
    
    public void isLeftLeaf(TreeNode node, boolean flag){
        if(node == null)
            return;
        
        if(flag && node.left == null && node.right == null)
            result += node.val;
        
        isLeftLeaf(node.left, true);
        isLeftLeaf(node.right, false);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        isLeftLeaf(root, false);
        
        return result;
    }
}