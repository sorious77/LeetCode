class Solution {
    public String intToRoman(int num) {
        String answer = "";
        
        while(num >= 1000){
            answer = answer.concat("M");
            num -= 1000;
        }
        
        if(num % 500 >= 400){
            if(num >= 900){
                answer = answer.concat("CM");
                num -= 900;
            }
            else{
                answer = answer.concat("CD");
                num -= 400;
            }
        }
        
        if(num >= 500){
            answer = answer.concat("D");
            num -= 500;
        }
        
        while(num >= 100){
            answer = answer.concat("C");
            num -= 100;
        }
        
        if(num % 50 >= 40){
            if(num >= 90){
                answer = answer.concat("XC");
                num -= 90;
            }
            else{
                answer = answer.concat("XL");
                num -= 40;
            }
        }
        
        if(num >= 50){
            answer = answer.concat("L");
            num -= 50;
        }
        
        while(num >= 10){
            answer = answer.concat("X");
            num -= 10;
        }
        
        if(num % 5 == 4){
            if(num == 9){
                answer = answer.concat("IX");
                num -= 9;
            }
            else{
                answer = answer.concat("IV");
                num -= 4;
            }
        }
        
        if(num >= 5){
            answer = answer.concat("V");
            num -= 5;
        }
        
        while(num >= 1){
            answer = answer.concat("I");
            num -= 1;
        }
        
        return answer;
    }
}