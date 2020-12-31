class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        Queue<TreeNode> treeQ = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        treeQ.offer(root);
        q.offer(0);
        
        while(!q.isEmpty()){
            TreeNode tempNode = treeQ.poll();
            int temp = q.poll();
            
            if(list.size() <= temp){
                list.add(tempNode.val);
            }
            else{
                list.set(temp, tempNode.val + list.get(temp));
            }
            
            if(tempNode.left != null){
                q.add(temp + 1);
                treeQ.add(tempNode.left);
            }
            
            if(tempNode.right != null){
                q.add(temp + 1);
                treeQ.add(tempNode.right);
            }
        }
        
        return list.get(list.size() - 1);
    }
}
