class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans=0;
        for(int i: nums){
            max = Math.max(i,max);
        }
        for(int i: nums){
            ans+=Math.abs(max-i);
        }
        return ans;
    }
}