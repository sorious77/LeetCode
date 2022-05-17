class Solution {
    String removeZero(StringBuilder sb) {
        while(sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
    
    public int numDifferentIntegers(String word) {
        Set<String> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(char c : word.toCharArray()) {
            if('0' <= c && c <= '9') {
                sb.append(c);
            } else if(!sb.isEmpty()) {
                String s = removeZero(sb);
                
                set.add(s);
                sb = new StringBuilder();
            }
        }
        
        if(!sb.isEmpty()) {
            String s = removeZero(sb);
                
            set.add(s);
        }
        
        return set.size();
    }
}
