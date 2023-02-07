class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) {
            return true;
        }

        StringBuilder sb = new StringBuilder(s);
        
        for(int i = 0; i < s.length() - 1; i++) {
            char first = sb.charAt(0);

            sb = sb.deleteCharAt(0).append(first);

            if(goal.equals(sb.toString())) {
                return true;
            }
        }

        return false;
    }
}
