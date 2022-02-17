class Solution {
    public int findFinalValue(int[] nums, int original) {
        return findValue(Arrays.stream(nums).boxed().collect(Collectors.toList()), original);
    }

    int findValue(List nums, int num) {
        return nums.contains(num) ? findValue(nums, num * 2) : num;
    }
}
