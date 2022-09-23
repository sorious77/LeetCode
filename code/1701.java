class Solution {
    public double averageWaitingTime(int[][] customers) {
        long sum = 0;
        long time = 0;
        
        for(int[] customer : customers) {
            if(time <= customer[0]) {
                sum += customer[1];
                time = customer[0] + customer[1];
            } else {
                sum += (time - customer[0]) + customer[1];
                time += customer[1];
            }
        }
        
        return (double) sum / customers.length;
    }
}
