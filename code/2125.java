class Solution {
    public int numberOfBeams(String[] bank) {
        int answer = 0;
        
        int prev = 0;
        int count = 0;
        for(String row : bank) {
            for(char c : row.toCharArray()) {
                if(c == '1') {
                    count += 1;
                }
            }
            
            if(count == 0) {
                continue;
            }
            
            answer += prev * count;
            
            prev = count;
            count = 0;
        }
        
        return answer;
    }
}
