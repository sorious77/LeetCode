class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> isDiv = new ArrayList<>();
        
        int num = nums[0];
        isDiv.add(num % 5 == 0);
        
        for(int i=1;i<nums.length;i++){
            num = (num * 2) % 10;
            num += nums[i];
            
            isDiv.add(num % 5 == 0);
        }
        
        return isDiv;
    }
}
