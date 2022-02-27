class Solution {
    void traversal(List<List<Integer>> info, TreeNode root, int level) {
        if(root == null) {
            return;
        }
        
        if(info.size() < level) {
            info.add(new ArrayList<>());
        }
        
        info.get(level - 1).add(root.val);
        
        traversal(info, root.left, level + 1);
        traversal(info, root.right, level + 1);
    }
    
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> info = new ArrayList<>();
        List<Double> answer = new ArrayList<>();
        
        traversal(info, root, 1);
        
        for(List<Integer> level : info) {
            long sum = 0;
            
            for(int val : level) {
                sum += val;
            }
            
            answer.add((double)((double)sum / level.size()));
        }
        
        return answer;
    }
}
