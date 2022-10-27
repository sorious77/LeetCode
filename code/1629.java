class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] times = new int[26];
        
        int prev = 0;
        for(int i = 0; i < releaseTimes.length; i++) {
            char c = keysPressed.charAt(i);
            
            times[c - 'a'] = Math.max(times[c - 'a'], releaseTimes[i] - prev);
            
            prev = releaseTimes[i];
        }
        
        int idx = 0;
        for(int i = 0; i < 26; i++) {
            if(times[idx] <= times[i]) {
                idx = i;
            }
        }
        
        return (char)(idx + 'a');
    }
}
