public class node{
    int level;
    TreeNode tree;
    
    node() {}
    node(TreeNode tree, int level){
        this.level = level;
        this.tree = tree;
    }
}

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList();
        List<List<Integer>> sum = new ArrayList();
        
        Queue<node> q = new LinkedList<node>();
        
        q.offer(new node(root, 0));
        while(!q.isEmpty()){
            node temp = q.poll();
            
            if(sum.size() < temp.level){
                sum.add(new ArrayList());
            }
            
            sum.get(temp.level).add(temp.tree.val);
            
            if(temp.tree.left != null)
                q.offer(new node(temp.tree.left, temp.level + 1));
            
            if(temp.tree.right != null)
                q.offer(new node(temp.tree.right, temp.level + 1));
        }
        
        for(int i=0;i<sum.size();i++){
            int tempSum = 0;
            
            for(int j=0;j<sum.get(i).size();j++){
                tempSum += sum.get(i).get(j);
            }
            
            answer.add((double)tempSum / sum.get(i).size());
        }
        
        return answer;


    }
}
