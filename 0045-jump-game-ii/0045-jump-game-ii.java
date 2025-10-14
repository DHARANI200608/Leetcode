class Solution {
    public int jump(int[] nums) {
        int j = 0;
        int l = 0, r = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            r = Math.max(r, i + nums[i]);
            if (i == l) {
                j++;
                l = r;
            }
        }
        return j;
    }
}