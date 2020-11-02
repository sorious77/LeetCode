class Solution {    
    public String convertToTitle(int n) {
        String answer = "";
                
        while(n > 0){
            n--;
            
            answer = (char)(n % 26 + 'A') + answer;
            n /= 26;
        }
        
        return answer;
    }
}