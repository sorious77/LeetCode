class Solution {
    boolean answer = false;

    void isPowerOfThree(List<Integer> powerOfThree, boolean[] visited, int n, int sum, int idx) {
        if (sum > n) {
            return;
        } else if (sum == n) {
            answer = true;
            return;
        }

        if (answer) {
            return;
        }

        for (int i = idx; i < powerOfThree.size(); i++) {
            if (answer) {
                return;
            }

            if (!visited[i]) {
                visited[i] = true;
                isPowerOfThree(powerOfThree, visited, n, sum + powerOfThree.get(i), i + 1);
                visited[i] = false;
            }
        }
    }

    public boolean checkPowersOfThree(int n) {
        final int MAX_RANGE = 10000000;

        List<Integer> powerOfThree = new ArrayList<>();

        int num = 1;

        while (num <= MAX_RANGE) {
            powerOfThree.add(num);

            num *= 3;
        }

        Collections.sort(powerOfThree, (o1, o2) -> Integer.compare(o2, o1));

        isPowerOfThree(powerOfThree, new boolean[powerOfThree.size()], n, 0, 0);

        return answer;
    }
}
