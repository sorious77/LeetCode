class Solution {
    List<String> letterCasePermutations = new ArrayList<>();
    
    void permutation(char[] charArr, List<Integer> charIdx, int idx) {
        if(idx == charIdx.size()) {
            letterCasePermutations.add(new String(charArr));
            return;
        }
        
        permutation(charArr, charIdx, idx + 1);
        
        char cur = charArr[charIdx.get(idx)];
        charArr[charIdx.get(idx)] = Character.toUpperCase(cur);
        permutation(charArr, charIdx, idx + 1);
        charArr[charIdx.get(idx)] = Character.toLowerCase(cur);
    }
    
    public List<String> letterCasePermutation(String s) {
        char[] charArr = s.toCharArray();
        List<Integer> charIdx = new ArrayList<>();
        
        for(int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            
            if('a' <= c && c <= 'z') {
                charIdx.add(i);
            } else if('A' <= c && c <= 'Z') {
                charIdx.add(i);
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
        }
        
        permutation(charArr, charIdx, 0);
        
        return letterCasePermutations;
    }
}