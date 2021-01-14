class Data{
    Node node;
    int level;
    
    Data(){}
    Data(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(Node root) {        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null)
            return list;
        
        Queue<Data> q = new LinkedList<>();
        q.offer(new Data(root, 0));
        
        while(!q.isEmpty()){
            Data cur = q.poll();
            
            if(cur.level == list.size()){
                List<Integer> newList = new ArrayList<>();
                
                list.add(newList);
            }
            
            list.get(cur.level).add(cur.node.val);
            
            for(int i=0;i<cur.node.children.size();i++){
                q.offer(new Data(cur.node.children.get(i), cur.level + 1));
            }
        }
        
        return list;
    }
}
