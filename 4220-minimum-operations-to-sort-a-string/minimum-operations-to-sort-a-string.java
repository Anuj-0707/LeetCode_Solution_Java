class Solution {
    public int minOperations(String s) {
        int l = s.length();
        if(isSorted(s)){
            return 0;
        }
        if(l==2){
            return -1;
        }
        int min_i=26;
        int max_i=-1;
        for(int i=0;i<l;i++){
            int x = s.charAt(i)-'a';
            if(min_i>x){
                min_i=x;
            }
            if(x>max_i){
                max_i=x;
            }
        }
        char ch1 = (char)(min_i+'a');
        char ch2 = (char)(max_i+'a');
        if(ch1==s.charAt(0) || ch2==s.charAt(l-1)){
            return 1;
        }
        for(int i=1;i<l-1;i++){
            if(ch1==s.charAt(i)||ch2==s.charAt(i)){
                return 2;
            }
        }
        return 3;
    }
    public static boolean isSorted(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}