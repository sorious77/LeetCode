class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean []alpha = new boolean[26];
        int answer = 0;
        
        for(int i=0;i<allowed.length();i++){
            alpha[allowed.charAt(i) - 'a'] = true;
        }
        
        boolean flag = false;
        for(int i=0;i<words.length;i++){
            flag = true;
            for(int j=0;j<words[i].length();j++){
                if(!alpha[words[i].charAt(j) - 'a']){
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                answer++;
        }
        
        return answer;
    }
}
