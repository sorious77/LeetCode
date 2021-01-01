class Solution {
    List<Integer> answer;
    
    void inorder(TreeNode root){
        if(root == null)
            return;
        
        inorder(root.left);
        answer.add(root.val);
        inorder(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        
        inorder(root);
        
        return answer;
    }
}
