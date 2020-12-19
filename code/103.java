class Solution {
    List<List<Integer>> answer;
    
    void traversal(TreeNode temp, int level){
        if(temp == null)
            return;
        
        if(answer.size() <= level){
            answer.add(new ArrayList());
        }
        
        if(level % 2 == 0){
            answer.get(level).add(temp.val);
        }
        else{
            answer.get(level).add(0, temp.val);
        }
        
        traversal(temp.left, level + 1);
        traversal(temp.right, level + 1);

        return;
    }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        answer = new ArrayList();
        
        traversal(root, 0);
            
        return answer;
    }
}
