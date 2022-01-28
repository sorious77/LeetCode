class Solution {
    Set<Integer> set = new HashSet<>();
    
    public boolean isHappy(int n) {
        int sum = 0;
        
        while(n != 0) {
            sum += (n % 10) * (n % 10);
            
            n /= 10;
        }
        
        if(set.contains(sum)) {
            return sum == 1;
        }
        
        set.add(sum);
        
        if(sum == 1)
            return true;
        
        return isHappy(sum);
    }
}
