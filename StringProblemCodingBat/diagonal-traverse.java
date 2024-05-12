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

/*
   0 1 2
0  1 2 3
1  4 5 6
2  7 8 9

   0  1  2  3
0  1  2  3  5
1  5  6  7  8
2  9  10 11 12
3  13 14 15 16
dir dur = i--, j++;
dir dwl = i++, j--;
dir dul = i--, j--;
dir dwr = i++, j++;

We use : 
dir dur = i--, j++;
dir dwl = i++, j--;



(0,0) -->dwl
(1,0) -->dup
(0,2) -->dwl
(2,2) -->dup

n = 3 
m = 3
*/