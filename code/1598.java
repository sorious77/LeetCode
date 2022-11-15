class Solution {
    public int minOperations(String[] logs) {
        int level = 0;
        
        for(String log : logs) {
            if(log.startsWith("../")) {
                if(level > 0) {
                    level -= 1;
                }
            } else if(log.startsWith("./")) {
                continue;
            } else {
                level += 1;
            }
        }
        
        return level;
    }
}
