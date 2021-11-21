import java.util.stream.IntStream;

class Solution {    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode tree = null;
                
        int length = inorder.length;
        
        if(length == 1){
            return new TreeNode(inorder[0]);
        } else if(length == 0){
            return null;
        }
            
        int root = postorder[length - 1];
        
        int leftIndex = IntStream.range(0, length).filter(i -> root == inorder[i]).findFirst().orElse(-1);
        
        tree = new TreeNode(root, buildTree(Arrays.copyOfRange(inorder, 0, leftIndex), Arrays.copyOfRange(postorder, 0, leftIndex)),
                            buildTree(Arrays.copyOfRange(inorder, leftIndex + 1, length), Arrays.copyOfRange(postorder, leftIndex, length - 1)));
        
        return tree;
    }
}