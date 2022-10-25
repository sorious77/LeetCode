class Solution {
    List<Integer> tree = new ArrayList<>();
    
    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        tree.add(root.val);
        inorder(root.right);
    }
    
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);

        return makeBalanceTree(0, tree.size() - 1);
    }
    
    TreeNode makeBalanceTree(int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new TreeNode(tree.get(start));
        }

        int mid = (start + end) / 2;
        return new TreeNode(tree.get(mid), makeBalanceTree(start, mid - 1), makeBalanceTree(mid + 1, end));
    }
}
