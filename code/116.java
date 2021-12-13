class Solution {        
    public Node connect(Node root) {
        if(root == null) {
            return null;
        }
        
        int level = 0;
        int count = 0;
        Node tail = root;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {            
            Node cur = queue.poll();            
            count++;
            
            if(Math.pow(2, level) == count) {
                count = 0;
                level++;
                tail = queue.peek();
            } else {
                if(!queue.isEmpty()) {
                    tail = cur;
                    tail.next = queue.peek();
                }
            }
            
            if(cur.left != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
        }
        
        return root;
    }
}