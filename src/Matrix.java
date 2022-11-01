import java.util.Random;

public class Matrix {
    private final int m;
    private final int n;
    private final int mod;
    private final int[][] matrix;

    Matrix(int _n, int _m, int _mod) {
        if(_n <= 0 || _m <= 0)
            throw new RuntimeException();
        n = _n;
        m = _m;
        mod = _mod;
        matrix = new int[m][n];
        Random rng = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rng.nextInt(0,mod);
            }
        }
    }

    Matrix(int _mod, int[][] values) {
        mod = _mod;

        int maxSize = 0;
        for (int[] line: values) {
            maxSize = Math.max(maxSize, line.length);
        }

        m = values.length;
        n = maxSize;
        int[][] _matrix = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if(values.length > i && values[i].length > j)
                    _matrix[i][j] = Math.floorMod(values[i][j], _mod);
            }
        }
        matrix = _matrix;
    }

    private int getValAt(int _m,int _n){
        if (_m >= this.m || _n >= this.n){
            return 0;
        }
        else {
            return this.matrix[_m][_n];
        }
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        if(a.mod != b.mod)
            throw new RuntimeException();
        int n,m;

        m = Math.max(a.m,b.m);
        n = Math.max(a.n,b.n);

        int[][] _matrix = new int[Math.max(a.m, b.m)][Math.max(a.n, b.n)];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                _matrix[i][j] = Math.floorMod(a.getValAt(i,j) * b.getValAt(i,j),a.mod);
            }
        }

        return new Matrix(a.mod,_matrix);
    }

    public static Matrix add(Matrix a, Matrix b) {
        if(a.mod != b.mod)
            throw new RuntimeException();
        int n = Math.max(a.n, b.n);
        int m = Math.max(a.m, b.m);

        int[][] _matrix = new int[m][n];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                _matrix[i][j] = Math.floorMod(a.getValAt(i,j) + b.getValAt(i,j),a.mod);

        return new Matrix(a.mod,_matrix);

    }
    public static Matrix substract(Matrix a, Matrix b) {
        if(a.mod != b.mod)
            throw new RuntimeException();
        int n = Math.max(a.n, b.n);
        int m = Math.max(a.m, b.m);

        int[][] _matrix = new int[m][n];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                _matrix[i][j] = Math.floorMod(a.getValAt(i,j) - b.getValAt(i,j),a.mod);

        return new Matrix(a.mod,_matrix);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m ; ++i) {
            for (int j = 0; j < n; j++) {
                String s = String.valueOf(getValAt(i,j)) + " ";
                sb.append(s);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
