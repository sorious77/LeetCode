class Solution {
    public int maxDepth(String s) {
        if(s.length() <= 1){
            return 0;
        }
        
        int answer = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.add('(');
                answer = Math.max(answer, st.size());
            }
            else if(s.charAt(i) == ')'){
                st.pop();
            }
        }
        
        return answer;
    }
}
