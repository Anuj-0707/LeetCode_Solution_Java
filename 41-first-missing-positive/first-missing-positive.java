class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        int[] count = new int[l+1];
        for(int x:nums){
            if(x>=1 && x<=l){
                count[x]++;
            }
        }
        for(int i=1;i<=l;i++){
            if(count[i]==0){
                return i;
            }
        }
        return l+1;
    }
}