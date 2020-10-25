class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            
            if(cur == 'I'){
                if(i + 1 < s.length()){
                    if(s.charAt(i+1) == 'V'){
                        i++;
                        answer += 4;
                    }
                    else if(s.charAt(i+1) == 'X'){
                        i++;
                        answer += 9;
                    }
                    else
                        answer += 1;
                }
                else
                    answer += 1;
            }
            else if(cur == 'V'){
                answer += 5;
            }
            else if(cur == 'X'){
                if(i + 1 < s.length()){
                    if(s.charAt(i+1) == 'L'){
                        i++;
                        answer += 40;
                    }
                    else if(s.charAt(i+1) == 'C'){
                        i++;
                        answer += 90;
                    }
                    else
                        answer += 10;
                }
                else
                    answer += 10;
            }
            else if(cur == 'L'){
                answer += 50;
            }
            else if(cur == 'C'){
                if(i + 1 < s.length()){
                    if(s.charAt(i+1) == 'D'){
                        i++;
                        answer += 400;
                    }
                    else if(s.charAt(i+1) == 'M'){
                        i++;
                        answer += 900;
                    }
                    else
                        answer += 100;
                }
                else
                    answer += 100;
            }
            else if(cur == 'D'){
                answer += 500;
            }
            else if(cur == 'M'){
                answer += 1000;
            }
        }
        
        return answer;
    }
}