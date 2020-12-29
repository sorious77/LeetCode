class FindElements {
    TreeNode root;
    ArrayList<Integer> list;

    public FindElements(TreeNode root) {
        list = new ArrayList<>();
        
        root.val = 0;
        list.add(0);
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            
            if(temp.left != null){
                temp.left.val = temp.val * 2 + 1;
                list.add(temp.val * 2 + 1);
                q.offer(temp.left);
            }
            
            if(temp.right != null){
                temp.right.val = temp.val * 2 + 2;
                list.add(temp.val * 2 + 2);
                q.offer(temp.right);
            }
        }
        
        this.root = root;
    }
    
    public boolean find(int target) {        
        return list.contains(target);
    }
}