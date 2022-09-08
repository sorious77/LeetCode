class BSTIterator {
    List<Integer> iter;
    int idx = 0;
    
    public BSTIterator(TreeNode root) {
        iter = new ArrayList<>();
        
        inorder(root);
    }
    
    public int next() {
        int nextVal = iter.get(idx);
        
        idx += 1;
        
        return nextVal;
    }
    
    public boolean hasNext() {
        return iter.size() > idx;
    }
    
    private void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        
        inorder(root.left);
        iter.add(root.val);
        inorder(root.right);
    }
}
