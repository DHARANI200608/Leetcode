class Solution {
    public int[] shuffle(int[] nums, int n) {

        // Create answer array
        int[] ans = new int[2 * n];

        // j is the index for ans array
        int j = 0;

        // Loop through first half
        for (int i = 0; i < n; i++) {

            // Take one element from first half
            ans[j] = nums[i];
            j++;

            // Take one element from second half
            ans[j] = nums[i + n];
            j++;
        }

        return ans;
    }
}