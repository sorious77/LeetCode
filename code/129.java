class data{
    TreeNode node;
    int sum;
    
    data(){}
    data(TreeNode node, int sum){
        this.node = node;
        this.sum = sum;
    }
}

class Solution {
    public int sumNumbers(TreeNode root) {
        Queue<data> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        if(root == null)
            return answer;
        
        q.offer(new data(root, 0));
        
        while(!q.isEmpty()){
            data temp = q.poll();
            
            if((temp.node.left == null) && (temp.node.right == null)){
                answer += temp.sum * 10 + temp.node.val;
            }
            
            if(temp.node.left != null){
                q.offer(new data(temp.node.left, temp.sum * 10 + temp.node.val));
            }
            if(temp.node.right != null){
                q.offer(new data(temp.node.right, temp.sum * 10 + temp.node.val));
            }
        }
        
        return answer;
    }
}
