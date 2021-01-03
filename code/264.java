class Solution {
    public int nthUglyNumber(int n) {        
        PriorityQueue<Long> q = new PriorityQueue<>();
        int index = 1, answer = 0;
        long temp = 0;
        
        q.offer(new Long(1));
        
        while(!q.isEmpty()){
            temp = q.poll();
            
            if(index == n){
                answer = Long.valueOf(temp).intValue();
                break;
            }
            
            if(!q.contains(temp * 2)){
                q.offer(temp * 2);
            }
            
            if(!q.contains(temp * 3)){
                q.offer(temp * 3);
            }
            
            if(!q.contains(temp * 5)){
                q.offer(temp * 5);
            }
            
            index++;
        }
        
        return answer;
    }
}
