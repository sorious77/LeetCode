class Solution {
    public boolean isPerfectSquare(int num) {
        long left, right;
        
        if(num > 2147395600){
            return false;
        }
        
        left = 1;
        right = 46430;
        
        long mid = (left + right)/2;
        
        System.out.print(mid);
        
        while(left <= right){
            mid = (left + right) / 2;
            
            if(mid * mid == num)
                return true;
            
            if(mid * mid < num){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        return false;
    }
}