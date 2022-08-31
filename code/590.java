class Solution {
    List<Integer> answer = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        traversal(root);
        
        return answer;
    }
    
    void traversal(Node root) {
        if(root == null) {
            return;
        }
        
        for(Node node : root.children) {
            traversal(node);
        }
        answer.add(root.val);
    }
}
