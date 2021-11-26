class Solution {
    List<Integer> result = new ArrayList<>();
    
    void postorder(TreeNode root) {
        if(root == null) return;
        
        postorder(root.left);
        postorder(root.right);
        result.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {        
        postorder(root);
        
        return result;
    }
}