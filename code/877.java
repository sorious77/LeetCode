class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        
        int alice = 0;
        int bob = 0;
        
        int n = piles.length;
        
        for(int i = n - 1; i >= 0; i -= 2) {
            alice += piles[i];
            bob += piles[i - 1];
        }
        
        return alice > bob;
    }
}
