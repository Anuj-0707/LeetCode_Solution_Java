class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        helper(candidates, target,0,0, l, ans);
        return ans;
    }
    public static void helper(int[] a , int t, int i, int sum, List<Integer> l, List<List<Integer>> ans){
        if(i>=a.length || sum>t){
            return;
        }
        if(sum==t){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j=i;j<a.length;j++){
            if(sum+a[j]<=t){
                l.add(a[j]);
                helper(a,t,j,sum+a[j],l,ans);
                l.remove(l.size()-1);
            }
        }
    }
}