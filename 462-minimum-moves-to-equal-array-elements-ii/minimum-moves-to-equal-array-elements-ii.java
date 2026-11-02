class Solution {
    public int minMoves2(int[] nums) {
        TreeMap<Integer,Integer> tp = new TreeMap<>();
        for(int i : nums){
            tp.put(i,tp.getOrDefault(i,0)+1);
        }
        int key=0;
        int l = nums.length/2;
        for(int i : tp.keySet()){
            int x = tp.get(i);
            if(x<=l){
                l=l-x;
                tp.put(i,0);
            }
            else{
                l=x-l;
                tp.put(i,l);
                key=i;
                break;
            }
        }
        int ans=0;
        for(int i : nums){
            ans+=Math.abs(key-i);
        }
        return ans;
    }
}