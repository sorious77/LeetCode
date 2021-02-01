class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(root == null)
            return null;
        
        if(d == 1){
            TreeNode temp = new TreeNode(v);
            
            temp.left = root;
            return temp;
        }
        
        if(d == 2){
            TreeNode left = root.left;
            TreeNode right = root.right;
            
            TreeNode temp = new TreeNode(v);
            root.left = temp;
            temp.left = left;
            
            temp = new TreeNode(v);
            root.right = temp;
            temp.right = right;
            
            return root;
        }
        
        root.left = addOneRow(root.left, v, d - 1);
        root.right = addOneRow(root.right, v, d - 1);
        return root;
    }
}
