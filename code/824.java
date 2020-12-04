class Solution {
    public String toGoatLatin(String S) {
        String ma = "ma";
        String temp = "";
        String answer = "";
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == ' '){
                if(temp.length() > 1){
                    char first = temp.charAt(0);
                    
                    if(first != 'a' && first != 'e' && first != 'i' && first != 'o' && first != 'u'
                       && first != 'A' && first != 'E' && first != 'I' && first != 'O' && first != 'U'
                    ){
                        temp = temp.substring(1, temp.length());
                        temp = temp.concat(Character.toString(first));
                    }   
                }
                ma = ma.concat("a");
                
                answer = answer.concat(temp).concat(ma).concat(" ");
                temp = "";
            }
            else{
                temp = temp.concat(Character.toString(S.charAt(i)));
            }
        }
        
        if(temp.length() > 1){
            char first = temp.charAt(0);    
            if(first != 'a' && first != 'e' && first != 'i' && first != 'o' && first != 'u'
               && first != 'A' && first != 'E' && first != 'I' && first != 'O' && first != 'U'
              ){
                temp = temp.substring(1, temp.length());
                temp = temp.concat(Character.toString(first));
            }
        }
        ma = ma.concat("a");
        
        answer = answer.concat(temp).concat(ma);
        
        return answer;
    }
}