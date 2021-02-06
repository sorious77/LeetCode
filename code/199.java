class data{
    TreeNode node;
    int level;
    
    data(){}
    data(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Queue<data> q = new LinkedList<>();
        
        if(root == null)
            return answer;
        
        int level = -1;
        q.offer(new data(root, 0));
        int size = -1;
        
        while(!q.isEmpty()){
            data temp = q.poll();
            
            if(size < temp.level){
                answer.add(temp.node.val);
                size++;
            }
            else{
                answer.set(size, temp.node.val);
            }
            
            if(temp.node.left != null){
                q.offer(new data(temp.node.left, temp.level + 1));
            }
            
            if(temp.node.right != null){
                q.offer(new data(temp.node.right, temp.level + 1));
            }
        }
        
        return answer;
    }
}
