class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {

        // Check original matrix
        if (same(mat, target)) {
            return true;
        }

        // Rotate 90 degrees
        rotate(mat);
        if (same(mat, target)) {
            return true;
        }

        // Rotate 180 degrees
        rotate(mat);
        if (same(mat, target)) {
            return true;
        }

        // Rotate 270 degrees
        rotate(mat);
        if (same(mat, target)) {
            return true;
        }

        return false;
    }

    // Rotate matrix 90 degrees clockwise
    public void rotate(int[][] mat) {
        int n = mat.length;

        int[][] temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = mat[i][j];
            }
        }

        // Copy temp back to mat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = temp[i][j];
            }
        }
    }

    // Check whether two matrices are equal
    public boolean same(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
