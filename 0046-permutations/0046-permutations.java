class Solution {
    public void findpermutation(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                findpermutation(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    } 
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
      List<List<Integer>> ans=new ArrayList<>();
      List<Integer> ds=new ArrayList<>();
      boolean[] freq=new boolean[n];
      findpermutation(nums,ans,ds,freq);
      return ans;  
    }
}