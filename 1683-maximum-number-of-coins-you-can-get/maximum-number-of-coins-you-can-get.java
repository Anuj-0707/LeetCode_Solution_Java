class Solution {
    public int maxCoins(int[] piles) {
        int l = piles.length,left=0,right=l-1;
        int[] temp = new int[l];
        int ans = 0;
        sort(piles,temp,left,right);
        while(left<right){
            ans+=piles[right-1];
            right=right-2;
            left++;
        }
        return ans;
    }
    public static void sort(int[] piles, int[] temp, int l, int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        sort(piles,temp,l,mid);
        sort(piles,temp,mid+1,r);
        merge(piles,temp,l,mid,r);
    }
    public static void merge(int[] piles, int[] temp, int l, int mid, int r){
        int i=l,k=l,j=mid+1;
        while(i<=mid && j<=r){
            if(piles[i]<=piles[j]){
                temp[k++]=piles[i++];
            }
            else{
                temp[k++]=piles[j++];
            }
        }
        while(i<=mid){
            temp[k++]=piles[i++];
        }
        while(j<=r){
            temp[k++]=piles[j++];
        }
        for(int x=l;x<=r;x++){
            piles[x]=temp[x];
        }
    }
}