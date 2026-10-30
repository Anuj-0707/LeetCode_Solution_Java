class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int h = queries[i][0];
            int k = queries[i][1];
            int r = queries[i][2];
            for (int[] p : points) {
                int dx = p[0] - h;
                int dy = p[1] - k;
                if (dx * dx + dy * dy <= r * r) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}