class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int candy = 1;
        int[] answer = new int[num_people];
        int idx = 0;
        
        while(candies > 0) {
            int cur = candy < candies ? candy : candies;
            
            if(candy < candies) {
                answer[idx] += cur;
            } else {
                answer[idx] += cur;
            }
            
            candies -= cur;
            
            idx = (idx + 1) % num_people;
            candy += 1;
        }
        
        return answer;
    }
}
