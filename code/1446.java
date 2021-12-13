class Solution {
    public int maxPower(String s) {
        int max = 1;

        char prev = '0';
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == prev) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
                prev = c;
            }
        }
        max = Math.max(max, count);

        return max;
    }
}