class Solution {
public
    vectorint twoSum(vectorint& nums, int target) {
        vectorint res;
        for(int i=0;inums.size()-1;i++){
            for(int j=i+1;jnums.size();j++){
                if(nums[i] + nums[j] == target){
                    res.push_back(i);
                    res.push_back(j);
                    break;
                }
            }
        }   
        return res;
    }
};