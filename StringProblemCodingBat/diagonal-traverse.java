class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        int i = 0, j =0 , idx=0;
        int m = mat.length , n = mat[0].length;
        String dir = "dur";
        int[] ans = new int[m*n];
        while ( idx < m*n ) {
            ans[idx] = mat[i][j];
            idx++;
            if ( dir.equals("dur")) {
                if ( j == m-1 ) {
                    i++;
                    dir = "dwl";
                } else if ( i == 0) {
                    j++;
                    dir = "dwl";
                } else  {
                    i--;
                    j++;
                }
            } else {
                if ( i == n-1 ) {
                    j++;
                    dir = "dur";
                } else if ( j == 0) {
                    i++;
                    dir = "dur";
                }else  {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}