class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!hp.containsKey(ch)){
                hp.put(ch,1);
            }
            else{
                hp.put(ch,hp.get(ch)+1);
            }
        }
        int min_len=Integer.MAX_VALUE;
        int len=0;
        int st=0;
        int end=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int k=i;k<=j;k++){
            char ch = s.charAt(k);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        while(j<s.length()&&i<=j){
            if(check(mp,hp)){
                if(min_len>j-i+1){
                    min_len=j-i+1;
                    st=i;
                    end=j;
                }
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                i++; 
            }
            else{
                j++;
                if(j==s.length()){
                    break;
                }
                int k=0;
                char c = s.charAt(j);
                if(mp.get(c)!=null){
                    k=mp.get(c)+1;
                }
                else{
                    k=1;
                }
                mp.put(s.charAt(j),k);
            }
        }
        if(min_len==Integer.MAX_VALUE){
            return "";
        }
        String str = s.substring(st,end+1);
        return str; 
    }
    public static boolean check(HashMap<Character,Integer> mp, HashMap<Character,Integer> hp){
        for(Character key : hp.keySet()){
            if(mp.get(key)==null || mp.get(key)<hp.get(key)){
                return false;
            }
        }
        return true;
    }
}