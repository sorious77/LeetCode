/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int levelX, levelY;
    int parentX, parentY;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        levelX = -1;
        levelY = -1;
        
        parentX = -1;
        parentY = -1;
        
        traversal(root, x, y, 0, -1);
        
        return ((levelX == levelY) && (parentX != parentY));
    }
    
    void traversal(TreeNode root, int x, int y, int level, int parent) {
        if(root == null || (levelX != -1 && levelY != -1)) 
            return;
        
        if(root.val == x) {
            parentX = parent;
            levelX = level;
        } else if(root.val == y) {
            parentY = parent;
            levelY = level;
        }
        
        traversal(root.left, x, y, level + 1, root.val);
        traversal(root.right, x, y, level + 1, root.val);
    }
}
