class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        
        int num1, num2;
        
        for(String token : tokens) {
            switch(token) {
                case "+":
                    num1 = Integer.parseInt(st.pop());
                    num2 = Integer.parseInt(st.pop());
                    
                    st.push(Integer.toString(num1 + num2));
                    break;
                case "-":
                    num1 = Integer.parseInt(st.pop());
                    num2 = Integer.parseInt(st.pop());
                    
                    st.push(Integer.toString(num2 - num1));
                    break;
                case "*":
                    num1 = Integer.parseInt(st.pop());
                    num2 = Integer.parseInt(st.pop());
                    
                    st.push(Integer.toString(num1 * num2));
                    break;
                case "/":
                    num1 = Integer.parseInt(st.pop());
                    num2 = Integer.parseInt(st.pop());
                    
                    st.push(Integer.toString(num2 / num1));
                    break;
                default:
                    st.push(token);
                    break;
            }
        }
        
        return Integer.parseInt(st.pop());
    }
}
