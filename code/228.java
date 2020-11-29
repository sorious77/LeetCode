class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList();
        
        int start, end;
        for(int i=0;i<nums.length;i++){
            if(i + 1 < nums.length){
               if(nums[i] + 1 == nums[i + 1]){
                   start = nums[i];
                   end = start;
                   while(i + 1 < nums.length){
                       if(nums[i] + 1 != nums[i + 1]){
                           break;
                       }
                       
                       end = nums[i + 1];
                       i++;
                   }
                   
                   String s = Integer.toString(start) + "->" + Integer.toString(end);
                   result.add(s);
               }
                else{
                    result.add(Integer.toString(nums[i]));
                }
            }
            else
                result.add(Integer.toString(nums[i]));
        }
        
        return result;
    }
}