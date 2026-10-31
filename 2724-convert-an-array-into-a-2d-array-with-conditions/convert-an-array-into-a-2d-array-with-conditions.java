class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int num : nums){
            hp.put(num,hp.getOrDefault(num,0)+1);
        }

        int len = nums.length;
        while(len>0){
            List<Integer> l = new ArrayList<>();
            for(Integer key : hp.keySet()){
                if(hp.get(key)>0){
                    l.add(key);
                    hp.put(key,hp.getOrDefault(key,0)-1);
                    len--;
                }
            }
            list.add(l);
        }
        return list;
    }
}