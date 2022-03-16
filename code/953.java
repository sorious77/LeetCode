class Solution {
    boolean isCorrectOrder(String s1, String s2, String order) {
        int length = s1.length() > s2.length() ? s2.length() : s1.length();

        for(int i = 0; i < length; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            int o1 = order.indexOf(c1);
            int o2 = order.indexOf(c2);

            if(o1 < o2) {
                return true;
            } else if(o1 > o2) {
                return false;
            }
        }

        if(s1.substring(0, length).equals(s2.substring(0, length)) && s1.length() > s2.length()) {
            return false;
        }

        return true;
    }
    
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(!isCorrectOrder(words[i], words[i + 1], order)) {
                    return false;
                }   
            }
        }
        
        return true;
    }
}
