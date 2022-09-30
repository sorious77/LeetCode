class Solution {
    class Pair implements Comparable<Pair> {
        int idx;
        int size;

        public Pair(int idx, int size) {
            this.idx = idx;
            this.size = size;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(size, o.size);
        }
    }
    
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(new Pair(i, groupSizes[i]));
        }

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> group = new ArrayList<>();
        int size = 0;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            group.add(p.idx);
            size += 1;

            if (size == p.size) {
                answer.add(group);
                group = new ArrayList<>();
                size = 0;
            }
        }

        return answer;
    }
}
