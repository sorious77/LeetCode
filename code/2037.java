class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            answer += Math.abs(students[i] - seats[i]);
        }
        
        return answer;
    }
}
