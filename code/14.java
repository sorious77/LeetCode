class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        
        if(strs.length == 0)
            return answer;
        
        for(int i=0;i<201;i++){            
            if(i >= strs[0].length())
                break;
            
            char cur = strs[0].charAt(i);
            
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || cur != strs[j].charAt(i)) // 가장 짧은 문자열을 기준으로 다 확인했거나, 다른 접두사가 나온 경우 종료
                    return answer;
            }
            
            answer += cur;
        }
        
        return answer;
    }
}