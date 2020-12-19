class Solution {
    List<List<Integer>> answer;
    
    void traversal(TreeNode temp, int level){
        if(temp == null)
            return;
        
        if(answer.size() <= level){
            answer.add(new ArrayList());
        }
        
        answer.get(level).add(temp.val);
        
        traversal(temp.left, level + 1);
        traversal(temp.right, level + 1);
        
        return;
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        answer = new ArrayList();
        
        traversal(root, 0);
            
        return answer;
    }
}
