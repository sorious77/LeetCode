class Solution {
    List<Integer> numbers = new ArrayList<>();
    
    void sortByAsc(TreeNode root) {
        if(root == null) {
            return;
        }
        
        sortByAsc(root.left);
        numbers.add(root.val);
        sortByAsc(root.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        sortByAsc(root);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.size() - 1; i++) {
            min = Math.min(min, numbers.get(i + 1) - numbers.get(i));
        }
        
        return min;
    }
}
