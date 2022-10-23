class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        int idx = 0;
        for (int[] query : queries) {
            int x = query[0];
            int y = query[1];
            int r = query[2];

            int count = 0;

            for (int[] point : points) {
                int px = point[0];
                int py = point[1];

                double dist = Math.pow(Math.abs(px - x), 2) + Math.pow(Math.abs(py - y), 2);
                double radius = Math.pow(r, 2);

                if (radius >= dist) {
                    count += 1;
                }
            }

            answer[idx++] = count;
        }

        return answer;
    }
}
