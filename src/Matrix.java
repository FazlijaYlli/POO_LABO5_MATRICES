import java.util.Random;

public class Matrix {
    private final int m;
    private final int n;
    private final int[][] matrix;

    Matrix(int _n, int _m, int max) {
        n = _n;
        m = _m;
        matrix = new int[n][m];
        Random rng = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = rng.nextInt(0,max);
            }
        }
    }

    Matrix(int _n, int _m, int[][] values) {
        n = _n;
        m = _m;
        matrix = values;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; ++i) {
            for (int j = 0; j < m; j++) {
                String s = String.valueOf(matrix[i][j]) + " ";
                sb.append(s);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
