class Solution {
    public String getHint(String secret, String guess) {
        int length = secret.length();
        
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        
        int bulls = 0;
        int cows = 0;
        
        for(int i=0;i<length;i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            
            if(s == g) {
                bulls++;
            } else {
                secretCount[s - '0']++;
                guessCount[g - '0']++;
            }
        }
        
        for(int i=0;i<10;i++){
            cows += Math.min(secretCount[i], guessCount[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(bulls).append("A").append(cows).append("B");
        
        return sb.toString();
    }
}
