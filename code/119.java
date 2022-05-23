class Solution {
    final int MAX_ROW = 33;
    
    public List<Integer> getRow(int rowIndex) {
        int[][] triangle = new int[2][MAX_ROW + 1];

        triangle[0][0] = 1;

        for(int i = 1; i <= rowIndex; i++) {
            triangle[i % 2][0] = 1;
            triangle[i % 2][i] = 1;

            for(int j = 1; j < rowIndex; j++) {
                triangle[i % 2][j] = triangle[(i + 1) % 2][j - 1] + triangle[(i + 1) % 2][j];
            }
        }

        List<Integer> row = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++) {
            row.add(triangle[rowIndex % 2][i]);
        }

        return row;
    }
}
