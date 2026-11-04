class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int row = score.length;
        int col = score[0].length;
        TreeMap<Integer,Integer> tp = new TreeMap<>();
        for(int i=0;i<row;i++){
            tp.put(score[i][k],i);
        }
        int s = row-1;
        for(int l : tp.keySet()){
            int r = tp.get(l);
            for(int i=0;i<col;i++){
                int temp = score[r][i];
                if(i==k){
                    tp.put(score[s][i],r);
                }
                score[r][i]=score[s][i];
                score[s][i]=temp;
            }
            s--;
        }
        return score;
    }
}