import java.util.*;

class Solution {
    List<List<Integer>> list;
    
    void traversal(TreeNode root, int level){
        if(root == null)
            return;
        
        if(list.size() <= level){
            List newList = new ArrayList();
            list.add(newList);
        }
        
        list.get(level).add(root.val);
        
        traversal(root.left, level+1);
        traversal(root.right, level+1);
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        list = new ArrayList();
        List init = new ArrayList();
        
        if(root == null)
            return init;        
        
        list.add(init);
        
        traversal(root, 0);
        
        List<List<Integer>> answer = new ArrayList();
        
        for(int i=list.size()-1;i>=0;i--){
            answer.add(list.get(i));
        }
        
        return answer;
    }
}