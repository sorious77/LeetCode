class node{
    TreeNode tree;
    int level;
    
    node(){}
    node(TreeNode tree, int level){
        this.tree = tree;
        this.level = level;
    }
}

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<node> q = new LinkedList<>();
        int maxLevel = -1;
        int answer = 0;
        
        q.offer(new node(root, 0));
        
        while(!q.isEmpty()){
            node temp = q.poll();
            
            if(temp.level > maxLevel){
                maxLevel = temp.level;
                answer = temp.tree.val;
            }
            
            if(temp.tree.left != null){
                q.offer(new node(temp.tree.left, temp.level + 1));
            }
            
            if(temp.tree.right != null){
                q.offer(new node(temp.tree.right, temp.level + 1));
            }
        }
        
        return answer;
    }
}