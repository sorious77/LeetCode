class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            
            sb.append(ch);
            
            if(ch == ')'){
                st.pop();
            }
            else{
                st.add('(');
            }
            
            if(st.isEmpty()){
                String temp = sb.toString();
                answer.append(temp.substring(1, temp.length() - 1));
                sb = new StringBuilder();
            }
        }
        
        return answer.toString();
    }
}
