class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] sum = new int[garbage.length];
        
        for(int i = 1; i < garbage.length; i++) {
            sum[i] = sum[i - 1] + travel[i - 1];
        }
        
        int[] lastIndex = new int[3];
        int garbageCount = 0;
        
        for(int i = 0; i < garbage.length; i++) {
            for(char c : garbage[i].toCharArray()) {
                if(c == 'G') {
                    lastIndex[0] = i;
                } else if(c == 'P') {
                    lastIndex[1] = i;
                } else {
                    lastIndex[2] = i;
                }
            }
            
            garbageCount += garbage[i].length();
        }
        
        int answer = garbageCount;
        
        for(int i = 0; i < 3; i++) {
            answer += sum[lastIndex[i]];
        }
        
        return answer;
    }
}
