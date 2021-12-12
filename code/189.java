class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;

        k = k % length;

        int []temp = new int[length];

        for(int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }

        for(int i = 0; i < length; i++) {
            temp[i] = nums[(length - k + i) % length];
        }

        for(int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }
}