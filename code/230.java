class Solution {
    List<Integer> numbers;
    
    void traversal(TreeNode root) {
        if(root == null) {
            return;
        }
        
        traversal(root.left);
        numbers.add(root.val);
        traversal(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        numbers = new ArrayList<>();
        
        traversal(root);
        
        return numbers.get(k - 1);
    }
}
