class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < nums2.length; i++) {
            int size = q.size();
            
            for(int j = 0; j < size; j++) {
                int cur = q.poll();
                
                if(cur < nums2[i]) {
                    map.put(cur, nums2[i]);
                } else {
                    q.offer(cur);
                }
            }
            
            q.offer(nums2[i]);
        }
        
        int[] answer = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; i++) {
            answer[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return answer;
    }
}
