class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int answer = 0;
        int n = plants.length;

        int water = capacity;
        for (int i = 0; i < n; i++) {
            if (water < plants[i]) {
                water = capacity;
                answer += ((i + 1) * 2) - 1;
            } else {
                answer += 1;
            }

            water -= plants[i];
        }

        return answer;
    }
}
