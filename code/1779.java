class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int answer = -1;
        
        for(int i = 0; i < points.length; i++) {
            if(points[i][0] == x || points[i][1] == y) {
                int diff = Math.abs((x + y) - (points[i][0] + points[i][1]));
                
                if(min > diff) {
                    min = diff;
                    answer = i;
                }
            }
        }
        
        return answer;
    }
}
