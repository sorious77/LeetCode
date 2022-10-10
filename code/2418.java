class Solution {
    class Person implements Comparable<Person> {
        String name;
        int height;

        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(Person o) {
            return Integer.compare(o.height, height);
        }
    }
    
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Person> pq = new PriorityQueue<>();

        for (int i = 0; i < names.length; i++) {
            pq.offer(new Person(names[i], heights[i]));
        }

        String[] answer = new String[names.length];

        int idx = 0;
        while (!pq.isEmpty()) {
            answer[idx++] = pq.poll().name;
        }

        return answer;
    }
}
