class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapOfS = new HashMap<>();
        Map<Character, Character> mapOfT = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if((mapOfS.containsKey(c1) && mapOfS.get(c1) != c2) || (mapOfT.containsKey(c2) && mapOfT.get(c2) != c1)) {
                return false;
            }
            
            mapOfS.put(c1, c2);
            mapOfT.put(c2, c1);
        }
        
        return true;
    }
}
