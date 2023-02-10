class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, new Comparator<int[]>() {
            public int compare(int[] s1, int[] s2) {
                return Integer.compare(s2[k], s1[k]);
            }
        });

        return score;
    }
}
