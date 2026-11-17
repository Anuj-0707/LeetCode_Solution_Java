class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        int l = digits.length();
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<l;i++){
            int x = digits.charAt(i)-'0';
            sb.append(arr[x]);
        }
        String s = sb.toString();
        int l1 = s.length();
        char[] ch = new char[s.length()];
        for(int i=0;i<l1;i++){
            ch[i]=s.charAt(i);
        }
        int t = (int) Math.pow(2,l1);
        for(int i=0;i<t;i++){
            StringBuilder sv = new StringBuilder();
            for(int j=0;j<l1;j++){
                if(((i>>j)&1)==1){
                    sv.append(ch[j]);
                }
            }
            if(sv.length()==l){
                String str = sv.toString();
                boolean flag = true;
                for(int k=0;k<l;k++){
                    char ch1 = str.charAt(k);
                    int x = digits.charAt(k)-'0';
                    if(arr[x].indexOf(ch1)==-1){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    if(!ans.contains(str))ans.add(str);
                }
            }
        }
        return ans;
    }
}