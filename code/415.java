class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        
        int length = Math.min(num1.length(), num2.length());
        boolean isBiggerThanTen = false;
        
        for(int i = 0; i < length; i++) {
            int n1 = num1.charAt(i) - '0';
            int n2 = num2.charAt(i) - '0';
            
            int sum = n1 + n2 + (isBiggerThanTen ? 1 : 0);
            
            isBiggerThanTen = false;
            
            if(sum >= 10) {
                isBiggerThanTen = true;
                sum = sum % 10;
            }
            
            sb.append(sum);
        }
        
        for(int i = length; i < num1.length(); i++) {
            int n = num1.charAt(i) - '0';
            
            int sum = n + (isBiggerThanTen ? 1 : 0);
            
            isBiggerThanTen = false;
            
            if(sum >= 10) {
                isBiggerThanTen = true;
                sum = sum % 10;
            }
            
            sb.append(sum);
        }
        
        for(int i = length; i < num2.length(); i++) {
            int n = num2.charAt(i) - '0';
            
            int sum = n + (isBiggerThanTen ? 1 : 0);
            
            isBiggerThanTen = false;
            
            if(sum >= 10) {
                isBiggerThanTen = true;
                sum = sum % 10;
            }
            
            sb.append(sum);
        }
        
        if(isBiggerThanTen) {
            sb.append("1");
        }
        
        return sb.reverse().toString();
    }
}
