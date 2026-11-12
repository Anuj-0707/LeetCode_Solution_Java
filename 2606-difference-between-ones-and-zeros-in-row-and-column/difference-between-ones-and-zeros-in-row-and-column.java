class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[] row0 = new int[r];
        int[] col0 = new int[c];
        int[] row1 = new int[r];
        int[] col1 = new int[c];
        for(int i=0;i<r;i++){
            int count0 =0,count1 =0;
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    count1++;
                    col1[j]++;
                }
                else{
                    count0++;
                    col0[j]++;
                }
            }
            row0[i]=count0;
            row1[i]=count1;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j] = row1[i]+col1[j]-row0[i]-col0[j];
            }
        }
        return grid;
    }
}