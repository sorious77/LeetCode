class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        
        int answer = 0;
        
        for(char c : s.toCharArray()) {
            if(c == ')') {
                if(!st.isEmpty()) {
                    st.pop();
                } else {
                    answer += 1;
                }
            } else {
                st.push('(');
            }
        }
        
        answer += st.size();
        
        return answer;
    }
}
