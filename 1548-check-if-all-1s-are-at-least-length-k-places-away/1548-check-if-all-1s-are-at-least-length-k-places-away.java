class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previous = -1, cur = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                if(previous == -1) previous = i;
                else if(cur == -1) cur = i;
                else{
                    if(cur - previous - 1 < k) return false;
                    previous = cur;
                    cur = i;
                }
            }
        }
        if(previous != -1 && cur != -1 && cur - previous - 1 < k)  return false;
        return true;
    }
}