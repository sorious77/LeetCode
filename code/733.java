class Solution {    
    boolean canMove(int x, int y, int m, int n) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length;
        int n = image[0].length;
        
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;

        if(canMove(sc, sr - 1, m, n) && image[sr - 1][sc] == oldColor && image[sr - 1][sc] != newColor) {
            image = floodFill(image, sr - 1, sc, newColor);
        }
        
        if(canMove(sc, sr + 1, m, n) && image[sr + 1][sc] == oldColor && image[sr + 1][sc] != newColor) {
            image = floodFill(image, sr + 1, sc, newColor);
        }
        
        if(canMove(sc - 1, sr, m, n) && image[sr][sc - 1] == oldColor && image[sr][sc - 1] != newColor) {
            image = floodFill(image, sr, sc - 1, newColor);
        }
        
        if(canMove(sc + 1, sr, m, n) && image[sr][sc + 1] == oldColor && image[sr][sc + 1] != newColor) {
            image = floodFill(image, sr, sc + 1, newColor);
        }
        
        return image;
    }
}
