class Solution {
    public int countPoints(String rings) {
        int[] roads = new int[10];

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int road = rings.charAt(i + 1) - '0';

            switch (color) {
                case 'R':
                    roads[road] |= 4;
                    break;
                case 'G':
                    roads[road] |= 2;
                    break;
                case 'B':
                    roads[road] |= 1;
            }
        }

        int answer = 0;
        for (int road : roads) {
            if (road == 7) {
                answer += 1;
            }
        }

        return answer;
    }
}
