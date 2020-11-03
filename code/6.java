class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        
        String []str = new String[numRows];
        
        for(int i=0;i<numRows;i++){
            str[i] = "";
        }
        
        boolean flag = false;
        int lineNum = 0;
        
        for(int i=0;i<s.length();i++){
            str[lineNum] = str[lineNum].concat(Character.toString(s.charAt(i)));
            
            if(lineNum == 0)
                flag = true;
            
            if(lineNum >= numRows - 1)
                flag = false;
            
            if(flag)
                lineNum++;
            else
                lineNum--;
        }
        
        String answer = "";
        for(int i=0;i<numRows;i++){
            answer = answer.concat(str[i]);
        }
        
        return answer;
    }
}