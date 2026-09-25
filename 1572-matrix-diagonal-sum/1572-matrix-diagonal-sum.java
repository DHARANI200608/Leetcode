class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum = sum + mat[i][i];

            // Secondary diagonal
            sum = sum + mat[i][n - 1 - i];
        }

        // If n is odd, the middle element was counted twice
        if (n % 2 == 1) {
            sum = sum - mat[n / 2][n / 2];
        }

        return sum;
    }
}