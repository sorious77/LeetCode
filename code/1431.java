class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        
        for(int candy : candies) {
            max = Math.max(max, candy);
        }
        
        List<Boolean> answer = new ArrayList<>();
        
        for(int candy : candies) {
            answer.add((candy + extraCandies) >= max);
        }
        
        return answer;
    }
}
