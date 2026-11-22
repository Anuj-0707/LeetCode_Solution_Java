class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long> list = new ArrayList<>();
        Arrays.sort(nums);
        int l = nums.length;
        int n = queries.length;
        long[] pre_Sum = new long[l+1];
        pre_Sum[0]=0;
        for(int i=1;i<=l;i++){
            pre_Sum[i] = pre_Sum[i-1]+nums[i-1];
        }
        for(int i=0;i<n;i++){
            int x = queries[i];
            int lt = 0;
            int r = l-1;
            int idx=-1;
            while(lt<=r){
                int mid = lt+(r-lt)/2;
                if(nums[mid]<=x){
                    lt=mid+1;
                    idx=mid;
                }
                else{
                    r=mid-1;
                }
            }
            int n1 = idx+1;
            long val = Math.abs(pre_Sum[n1]-(long)n1*x)+Math.abs((pre_Sum[l]-pre_Sum[n1])-(long)(l-n1)*x);
            list.add(val);
        }
        return list;
    }
}