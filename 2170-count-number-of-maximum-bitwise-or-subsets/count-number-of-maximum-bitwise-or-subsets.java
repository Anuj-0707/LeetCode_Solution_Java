class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int l = nums.length;
        int x = (int) Math.pow(2,l);
        int maxOr=0;
        for(int num : nums){
            maxOr|=num;
        }
        int count=0;
        int ans=0;
        for(int i=0;i<x;i++){
            int or=0;
            for(int j=0;j<l;j++){
                if(((i>>j)&1)==1){
                    or|=nums[j];
                }
            }
            if(or==maxOr){
                count++;
            }
        }
        return count;
    }
}