class Solution {    
    int[] init(String p){
        int[] arr = new int[p.length()];
        int j = 0;
        
        for(int i=1;i<p.length();i++){
            while(j > 0 && p.charAt(i) != p.charAt(j))
                j = arr[j-1];
            if(p.charAt(i) == p.charAt(j))
                arr[i] = ++j;
        }
        
        return arr;
    }
    
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        
        int []arr = init(needle);
        int j = 0;
                
        for(int i=0;i<haystack.length();i++){
            while(j>0 && haystack.charAt(i) != needle.charAt(j))
                j = arr[j-1];
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j == needle.length()-1){
                    return i - needle.length() + 1;
                }
                else
                    j++;
            }
        }
        
        return -1;
    }
}