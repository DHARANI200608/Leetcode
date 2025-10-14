class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;  // two pointers
        int lm = 0, rm = 0;                // left max and right max
        int water = 0;                      // total trapped water

        while (l <= r) {
            if (height[l] <= height[r]) {
                if (height[l] >= lm) lm = height[l]; // update left max
                else water += lm - height[l];        // add trapped water
                l++;
            } else {
                if (height[r] >= rm) rm = height[r]; // update right max
                else water += rm - height[r];        // add trapped water
                r--;
            }
        }

        return water;
    }
}