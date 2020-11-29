class Solution {
    public int firstUniqChar(String s) {
        int alphabet[] = new int[26];
        int minIndex = Integer.MAX_VALUE;
        
        for(int i=0;i<s.length();i++){
            int temp = s.charAt(i) - 'a';
            if(alphabet[temp] != 0)
                alphabet[temp] = -1;
            else
                alphabet[temp] = i + 1;
        }
        
        for(int i=0;i<26;i++){
            if(alphabet[i] > 0){
                if(minIndex > alphabet[i])
                    minIndex = alphabet[i];
            }
        }
        
        if(minIndex == Integer.MAX_VALUE)
            return -1;
        else
            return minIndex - 1;
    }
}