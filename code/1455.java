class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String temp = "";
        int answer = -1;
        int index = 1;
        
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            
            if(ch == ' '){
                if(temp.indexOf(searchWord) == 0){
                    return index;
                }
                
                temp = "";
                index++;
            }
            else
                temp = temp.concat(Character.toString(ch));
        }
        
        if(temp.indexOf(searchWord) == 0)
            answer = index;
        
        return answer;
    }
}