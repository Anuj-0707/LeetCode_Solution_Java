class Solution {
    public int countPartitions(int[] nums) {
       int sum1 =0,sum2=0,count=0;
       for(int i=0;i<nums.length;i++){
        sum2+=nums[i];
       }
       for(int i=0;i<nums.length-1;i++){
        sum1+=nums[i];
        sum2-=nums[i];
        if((sum1-sum2)%2==0){
            count++;
        }
       }
       return count;
    }
}