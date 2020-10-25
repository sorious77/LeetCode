class Solution {
    public int reverse(int x) {
        boolean checkMinus = false;
            
        if(x < 0){
            x *= -1;
            checkMinus = true;
        }
        
        String str = Integer.toString(x);
        
        String reverse_str = new StringBuilder(str).reverse().toString();

        int answer;
        
        try{
            answer = Integer.parseInt(reverse_str);
        } catch (NumberFormatException e){ // out of int size(overflow)
            answer = 0;
        }
        
        if(checkMinus)
            answer *= -1;
        
        return answer;
    }
}