class Solution {
    double getSlope(int x1, int y1, int x2, int y2) {
        return (double)(x2 - x1) / (y2 - y1);
    }
    
    public boolean checkStraightLine(int[][] coordinates) {
        int length = coordinates.length;
        boolean isHorizon = coordinates[0][1] == coordinates[1][1];
        boolean isVertical = coordinates[0][0] == coordinates[1][0];
        boolean isSame = true;
        
        double slope = getSlope(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
        
        for(int i = 2; i < length; i++) {
            if(slope != getSlope(coordinates[i - 1][0], coordinates[i - 1][1], coordinates[i][0], coordinates[i][1])) {
                isSame = false;
            }
            
            if(coordinates[i][1] != coordinates[i - 1][1]) {
                isHorizon = false;
            }
            
            if(coordinates[i][0] != coordinates[i - 1][0]) {
                isVertical = false;
            }
        }
        
        return isSame || isHorizon || isVertical;
    }
}
