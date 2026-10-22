class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        make(n,sb,list);
        if(list.size()<k){
            return "";
        }
        return list.get(k-1);
    }
    public static void make(int n, StringBuilder sb, ArrayList<String> list){
        if(n==0){
            list.add(sb.toString());
            return;
        }
        if(sb.length()==0){
            make(n-1,sb.append('a'),list);
            sb.deleteCharAt(sb.length()-1);
            make(n-1,sb.append('b'),list);
            sb.deleteCharAt(sb.length()-1);
            make(n-1,sb.append('c'),list);
            sb.deleteCharAt(sb.length()-1);
        }
        else{
            int l = sb.length();
            if(sb.charAt(l-1)=='a'){
                make(n-1,sb.append('b'),list);
                sb.deleteCharAt(sb.length()-1);
                make(n-1,sb.append('c'),list);
                sb.deleteCharAt(sb.length()-1);
            }
            else if(sb.charAt(l-1)=='b'){
                make(n-1,sb.append('a'),list);
                sb.deleteCharAt(sb.length()-1);
                make(n-1,sb.append('c'),list);
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                make(n-1,sb.append('a'),list);
                sb.deleteCharAt(sb.length()-1);
                make(n-1,sb.append('b'),list);
                sb.deleteCharAt(sb.length()-1);  
            }
        }
    }
}