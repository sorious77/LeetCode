class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        String str = "";
        
        if(digits[digits.length-1] == 9){
            str = "0";
            flag = true;
        }
        else{
            str = Integer.toString(digits[digits.length-1]+1);
        }
        
        for(int i=digits.length-2;i>=0;i--){
            if(flag){
                if(digits[i] == 9){
                    str = str.concat("0");
                }
                else{
                    str = str.concat(Integer.toString(digits[i] + 1));
                    flag = false;
                }
                
            }
            else{
                str = str.concat(Integer.toString(digits[i]));                
            }
        }
        
        if(flag)
            str = str.concat("1");
        
        int []answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--){
            answer[str.length() - i - 1] = str.charAt(i) - '0';
        }        
        
        return answer;
    }
}
