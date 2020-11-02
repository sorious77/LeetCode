class Solution {
    TreeNode root;
    
    TreeNode makeTree(TreeNode node, int []nums, int left, int right){        
        if(left > right)
            return null;
        
        if(left == right){
            TreeNode temp = new TreeNode();
            temp.val = nums[left];
            return temp;
        }
        
        int mid = (left + right + 1) / 2;
        
        node.val = nums[mid];
        node.left = new TreeNode();
        node.right = new TreeNode();
        node.left = makeTree(node.left, nums, left, mid-1);
        node.right = makeTree(node.right, nums, mid+1, right);
            
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        root = new TreeNode();
        
        root = makeTree(root, nums, 0, nums.length-1);
        
        return root;
    }
}