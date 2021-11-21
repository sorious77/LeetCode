class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(st.peek() == ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}
