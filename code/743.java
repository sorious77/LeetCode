class Solution {
    class Pair implements Comparable<Pair> {
        int time;
        int number;

        Pair(int time, int number) {
            this.time = time;
            this.number = number;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(time, o.time);
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        final int MAX_VALUE = 99999999;

        int[] minTime = new int[n + 1];
        Arrays.fill(minTime, MAX_VALUE);

        int[][] graph = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(graph[i], MAX_VALUE);
        }

        for (int[] time : times) {
            graph[time[0]][time[1]] = time[2];
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        minTime[k] = 0;
        pq.offer(new Pair(0, k));

        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            for (int i = 1; i <= n; i++) {
                if (p.time + graph[p.number][i] < minTime[i]) {
                    minTime[i] = p.time + graph[p.number][i];

                    pq.offer(new Pair(minTime[i], i));
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (minTime[i] == MAX_VALUE) {
                answer = -1;
                break;
            }
            answer = Math.max(answer, minTime[i]);
        }

        return answer;
    }
}
