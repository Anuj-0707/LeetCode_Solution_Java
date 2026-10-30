class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        int i=0;
        for(int[] arr : queries){
            int count=0;
            for(int[] a : points){
                boolean flag = check(arr[0],arr[1],arr[2],a[0],a[1]);
                if(flag){
                    count++;
                }
            }
            ans[i++]=count;
        }
        return ans;
    }
    public boolean check(int h, int k, int r, int x, int y){
        int x_part = (int)Math.pow((x-h),2);
        int y_part = (int)Math.pow((y-k),2);
        int r_part = (int)Math.pow(r,2);
        if(x_part+y_part<=r_part){
            return true;
        }
        return false;
    }
}