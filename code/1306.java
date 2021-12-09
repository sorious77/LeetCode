class Solution {
    boolean canMove(int length, int next) {
        return (next >= 0 && next < length);
    }

    public boolean canReach(int[] arr, int start) {
        boolean[] visit = new boolean[arr.length];

        int length = arr.length;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (arr[cur] == 0)
                return true;

            if (canMove(length, cur + arr[cur]) && !visit[cur + arr[cur]]) {
                queue.offer(cur + arr[cur]);
                visit[cur + arr[cur]] = true;
            }

            if (canMove(length, cur - arr[cur]) && !visit[cur - arr[cur]]) {
                queue.offer(cur - arr[cur]);
                visit[cur - arr[cur]] = true;
            }
        }

        return false;
    }
}