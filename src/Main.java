public class Main {
    public static void main(String[] args) {
        int mod = 5;
        System.out.println("mod is " + mod);

        Matrix A = new Matrix(5,2,mod);
        System.out.println("A (Random 5x2):\n"+A);

        int[][] values1 = {{1,3,1,1},{3,2,4,2},{1,0,1,0}};
        Matrix B = new Matrix(mod,values1);
        System.out.println("B :\n"+B);

        int[][] values2 = {{1,4,2,3,2},{0,1,0,4,2},{0,0,2,0,2}};
        Matrix C = new Matrix(mod,values2);
        System.out.println("C :\n"+C);

        Matrix D = Matrix.add(B,C);
        System.out.println("B+C :\n"+D);

        Matrix E = Matrix.substract(B,C);
        System.out.println("B-C :\n"+E);

        Matrix F = Matrix.multiply(B,C);
        System.out.println("B*C :\n"+F);

        Matrix G = new Matrix(1,1,mod);
        System.out.println("G (Random 1x1):\n"+G);

        Matrix H = new Matrix(20,10,mod);
        System.out.println("H (Random 1x1):\n"+H);

        Matrix I = Matrix.multiply(G, H);
        System.out.println("G*H:\n"+I);

        int[][] valuesRandomSize = {{1,3},{3,2,4},{1,0,1,6,0}};
        Matrix J = new Matrix(mod,valuesRandomSize);
        System.out.println("J (random size input arrays)\n"+J);
    }
}