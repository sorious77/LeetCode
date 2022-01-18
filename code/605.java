class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        
        for(int i = 0; i < length; i++) {
            if(flowerbed[i] == 0) {
                int continuous = i == 0 ? 1 : 0;
                
                while(i < length) {
                    if(flowerbed[i] == 1)
                        break;
                    
                    i++;
                    continuous++;
                }
                
                if(i == length && flowerbed[length - 1] == 0)
                    continuous += 1;
                
                count += ((continuous - 1) / 2);
            }
        }
        
        return count >= n;
    }
}
