class Solution {
    public int countPrimes(int n) {
        if(n == 0 || n == 1)
            return 0;
        
        boolean []prime = new boolean[n+1];
        
        prime[1] = true;
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i] == false){
                for(int j=2;i*j<n;j++){
                    prime[i*j] = true;
                }
            }
        }
        
        int count = 0;
        
        for(int i=1;i<n;i++){
            if(!prime[i])
                count++;
        }
        
        return count;
    }
}