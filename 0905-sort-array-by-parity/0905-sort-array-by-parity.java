class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] ans = new int[nums.length];
        int index = 0;

        // Store even numbers first
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[index] = nums[i];
                index++;
            }
        }

        // Store odd numbers next
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ans[index] = nums[i];
                index++;
            }
        }

        return ans;
    }
}