class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int length = startTime.length;
        int answer = 0;
        
        for(int i = 0; i < length; i++) {
            if(startTime[i] <= queryTime && queryTime <= endTime[i]) {
                answer += 1;
            }
        }
        
        return answer;
    }
}
