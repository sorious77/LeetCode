class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> positive = new LinkedList<>();
        Queue<Integer> negative = new LinkedList<>();
        
        for(int num : nums) {
            if(num > 0) {
                positive.offer(num);
            } else {
                negative.offer(num);
            }
        }
        
        int[] answer = new int[nums.length];
        int idx = 0;
        
        while(!positive.isEmpty()) {
            answer[idx++] = positive.poll();
            answer[idx++] = negative.poll();
        }
        
        return answer;
    }
}
