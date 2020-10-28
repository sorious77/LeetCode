class Solution {    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p != null && q == null) || (p == null && q != null)) // 둘 중 하나만 null이면 false
            return false;
        
        if(p == null && q == null) // 둘다 null이면 true
            return true;
        
        if(p.val != q.val) // 값이 다르면 false
            return false;
        
        if(isSameTree(p.left, q.left) == false) // 왼쪽 자식을 비교해서 다르면 false
            return false;
        
        if(isSameTree(p.right, q.right) == false) // 오른쪽 자식을 비교해서 다르면 false
            return false;
        
        return true;
    }
}