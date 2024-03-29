class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        
        for(char c : s.toCharArray()) {
            if(c == letter) {
                count += 1;
            }
        }
        
        int percentage = count * 100 / s.length();
        
        return percentage;
    }
}
