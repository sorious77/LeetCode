class Solution {
    public boolean canJump(int[] nums) {
        boolean visit[] = new boolean[nums.length];
        
        Queue<Integer> q = new LinkedList();
        
        q.add(0);
        
        boolean flag = false;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            if(cur == nums.length - 1){
                flag = true;
                break;
            }
            
            for(int i=1;i<=nums[cur];i++){
                if(cur + i < nums.length){
                    if(!visit[cur + i]){
                        visit[cur + i] = true;
                        q.add(cur + i);
                    }
                }
            }
        }
        
        return flag;
    }
}