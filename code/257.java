class Solution {
    List<String> treePaths = new ArrayList<>();
    
    void traversal(TreeNode root, List<Integer> paths) {
        if(root == null)
            return;
        
        if(root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            
            for(int val : paths) {
                sb.append(val).append("->");
            }
            sb.append(root.val);
            
            treePaths.add(sb.toString());
            return;
        }
        
        paths.add(root.val);
        traversal(root.left, new ArrayList<>(paths));
        traversal(root.right, new ArrayList<>(paths));
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root, new ArrayList<Integer>());
        
        return treePaths;   
    }
}
