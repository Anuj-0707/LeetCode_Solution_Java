public class triPair{
    int val;
    int i;
    int j;
    triPair(int val, int i, int j){
        this.val = val;
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        List<triPair> l = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    l.add(new triPair(0,i,j));
                }
            }
        }
        for(triPair tp : l){
            int row = tp.i;
            int col = tp.j;
            for(int i=0;i<r;i++){
                matrix[i][col]=0;
            }
            for(int i=0;i<c;i++){
                matrix[row][i]=0;
            }
        }
    }
}