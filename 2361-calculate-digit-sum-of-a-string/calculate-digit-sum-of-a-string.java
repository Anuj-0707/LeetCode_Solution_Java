class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int end = Math.min(i+k,s.length());
            String str = s.substring(i,end);
            int sum=0;
            for(int j=0;j<str.length();j++){
                sum+=(str.charAt(j)-'0');
            }
            String str1 = String.valueOf(sum);
            sb.append(str1);
        }
        return digitSum(sb.toString(),k);
    }
}