class Solution {
    Boolean[] dp;
    public boolean canJump(int[] nums) {
        dp=new Boolean[nums.length];
        return helper(nums,0);
    }
    public boolean helper(int[] nums,int i){
        if(i>=nums.length-1){
            return true;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        if(nums[i]==0){
            return dp[i]=false;
        }
        for(int x = 1;x<=nums[i];x++){
            if(helper(nums,i+x)==true){
                return dp[i]=true;
            }
        }
        return dp[i]=false;
    }
}