class Solution {
    public boolean isValid(String s) {
        char []st = new char[10001];
        
        int top = -1;
        
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            
            if(cur == '(' || cur == '[' || cur == '{'){
                st[++top] = cur;
            }
            else{
                if(top <= -1) // stack empty
                    return false;
                
                if(cur == ')'){
                    if(st[top] == '(')
                        top--;
                    else
                        return false;
                }
                else if(cur == ']'){
                    if(st[top] == '[')
                        top--;
                    else
                        return false;
                }
                else if(cur == '}'){
                    if(st[top] == '{')
                        top--;
                    else
                        return false;
                }
            }
        }
        
        if(top != -1)
            return false;
        
        return true;
    }
}