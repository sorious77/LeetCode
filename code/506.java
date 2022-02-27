class Solution {
    String toMedal(int n) {
        if(n == 1) {
            return "Gold Medal";
        } else if(n == 2) {
            return "Silver Medal";
        } else if(n == 3) {
            return "Bronze Medal";
        }
        
        return Integer.toString(n);
    }
    
    public String[] findRelativeRanks(int[] score) {
        int length = score.length;
        String[] answer = new String[length];
        
        int[] copy = Arrays.copyOf(score, length);
        
        Arrays.sort(copy);
        Map<Integer, Integer> ranks = new HashMap<>();
        
        for(int i = 0; i < length; i++) {
            ranks.put(copy[i], length - i);
        }
        
        for(int i = 0; i < length; i++) {
            answer[i] = toMedal(ranks.get(score[i]));
        }
        
        return answer;
    }
}
