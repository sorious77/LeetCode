class Solution {
    public int nthUglyNumber(int n) {        
        PriorityQueue<Long> q = new PriorityQueue<>();
        ArrayList<Long> arr = new ArrayList<>();
        int index = 1, answer = 0;
        long temp = 0;
        
        q.offer(new Long(1));
        arr.add(new Long(1));
        
        while(!q.isEmpty()){
            temp = q.poll();
            
            if(index == n){
                answer = Long.valueOf(temp).intValue();
                break;
            }
            
            if(!arr.contains(temp * 2)){
                q.offer(temp * 2);
                arr.add(temp * 2);
            }
            
            if(!arr.contains(temp * 3)){
                q.offer(temp * 3);
                arr.add(temp * 3);
            }
            
            if(!arr.contains(temp * 5)){
                q.offer(temp * 5);
                arr.add(temp * 5);
            }
            
            index++;
        }
        
        return answer;
    }
}
