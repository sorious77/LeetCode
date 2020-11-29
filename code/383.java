class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []alphabet = new int[26];
        
        for(int i=0;i<magazine.length();i++){
            alphabet[magazine.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            char temp = ransomNote.charAt(i);
            if(alphabet[temp - 'a'] > 0){
                alphabet[temp - 'a']--;
            }
            else
                return false;
        }
        
        return true;
    }
}