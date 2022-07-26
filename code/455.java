class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int cookieIdx = 0;
        for(int i = 0; i < g.length; i++) {
            int j = cookieIdx;
            for(; j < s.length && s[j] < g[i]; j++);
            
            if(j >= s.length)
                return i;
            
            cookieIdx = j + 1;
        }
        
        return g.length;
    }
}
