class Solution {
    public String interpret(String command) {
        String answer = "";
        for(int i=0;i<command.length();i++){
            char temp = command.charAt(i);
            
            if(temp == '('){
                if(command.charAt(i+1) == ')'){
                    answer = answer.concat("o");
                    i++;
                }
                else{
                    answer = answer.concat("al");
                    i += 3;
                }
            }
            else
                answer = answer.concat("G");
        }
        
        return answer;
    }
}
