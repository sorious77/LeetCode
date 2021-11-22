class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {        
        if(root == null) {
            return null;
        }
        
        if(root.val == key) {
            if(root.left == null && root.right == null){
                root = null;
            } else if(root.left == null) {
                root = root.right;
            } else if(root.right == null) {
                root = root.left;
            } else {
                TreeNode min = root.right;

                while(min.left != null) {
                    min = min.left;
                }

                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
            }
        } else if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        
        return root;
    }
}