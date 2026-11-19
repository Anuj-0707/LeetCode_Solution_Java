class Solution {
    int[] dp;
    public int jump(int[] nums) {
        int l = nums.length;
        dp = new int[l];
        Arrays.fill(dp,-1);
        return helper(nums,0);
    }
    public int helper(int[] nums, int i){
        if(i>=nums.length-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int min = Integer.MAX_VALUE;
        for(int x=1;x<=nums[i];x++){
            int next = helper(nums,i+x);
            if(next!=Integer.MAX_VALUE){
                min = Math.min(min,1+next);
            }
        }
        return dp[i]=min;
    }
}