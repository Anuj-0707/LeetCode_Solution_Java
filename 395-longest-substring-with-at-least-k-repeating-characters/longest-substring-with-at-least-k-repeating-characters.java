class Solution {
    public int longestSubstring(String s, int k) {
        HashMap<Character, Integer> hp = new HashMap<>();
        int n = s.length();
        if(n<k||n==0){
            return 0;
        }
        if(k<=1){
            return n;
        }
        for(int i=0;i<n;i++){
            hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
        }
        int l = 0;
        while(l<n && hp.get(s.charAt(l))>=k){
            l++;
        }
        if(l>n-1){
            return l;
        }
        int left = longestSubstring(s.substring(0,l),k);
        while(l<n && hp.get(s.charAt(l))<k){
            l++;
        }
        int right = l<n?longestSubstring(s.substring(l),k):0;
        return Math.max(left,right);
    }
}