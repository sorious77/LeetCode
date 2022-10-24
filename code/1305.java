class Solution {
    void traversal(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        
        traversal(root.left, list);
        list.add(root.val);
        traversal(root.right, list);
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        List<Integer> answer = new ArrayList<>();
        
        traversal(root1, list1);
        traversal(root2, list2);
        
        int size1 = list1.size();
        int size2 = list2.size();
        
        int i = 0, j = 0;
        for(; i < size1 && j < size2; ) {
            int num1 = list1.get(i);
            int num2 = list2.get(j);
            
            if(num1 < num2) {
                answer.add(num1);
                i += 1;
            } else {
                answer.add(num2);
                j += 1;
            }
        }
        
        for(; i < size1; i++) {
            answer.add(list1.get(i));
        }
        
        for(; j < size2; j++) {
            answer.add(list2.get(j));
        }
        
        return answer;
    }
}
