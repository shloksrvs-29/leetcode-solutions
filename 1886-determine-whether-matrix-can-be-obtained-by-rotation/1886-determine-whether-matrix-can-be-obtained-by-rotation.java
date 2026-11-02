class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int r = 0; r < 4; r++) {

            boolean flag = true;

            // Check if both matrices are equal
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }

            if (flag) return true;

            // Rotate 90 degrees clockwise
            int[][] temp = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[i][j] = mat[n - 1 - j][i];
                }
            }

            mat = temp;
        }

        return false;
    }
}