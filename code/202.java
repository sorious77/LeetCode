class Solution {
    Set<Integer> set = new HashSet<>();
    
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        }
        
        if(set.contains(n)) {
            return false;
        }
        
        set.add(n);
        
        int num = 0;
        while(n > 0) {
            num += (n % 10) * (n % 10);
            n /= 10;
        }
        
        return isHappy(num);
    }
}
