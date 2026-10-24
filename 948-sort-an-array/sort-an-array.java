class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums,temp,0,nums.length-1);
        return nums;
    }
    public void sort(int[] nums, int[] temp, int l, int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        sort(nums,temp,l,mid);
        sort(nums,temp,mid+1,r);
        merge(nums,temp,l,mid,r);
    }
    public void merge(int[] nums, int[] temp, int l, int mid, int r){
        int i=l,j=mid+1,k=l;
        while(i<=mid&&j<=r){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=r){
            temp[k++]=nums[j++];
        }
        for(int t=l;t<=r;t++){
            nums[t]=temp[t];
        }
    }
}