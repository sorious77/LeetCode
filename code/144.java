class Solution {
    List<Integer> traversal = new ArrayList<>();

    void preorder(TreeNode root) {
        if (root == null)
            return;

        traversal.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);

        return traversal;
    }
}