class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        boolean []isExist = new boolean[1001];

        for(int i : map.keySet()) {
            int count = map.get(i);
            if(isExist[count]){
                return false;
            }
            else {
                isExist[count] = true;g
            }
        }

        return true;
    }
}