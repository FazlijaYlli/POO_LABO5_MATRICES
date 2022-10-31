public class Main {
    public static void main(String[] args) {
        int mod = 5;
        System.out.println("mod is " + mod);

        Matrix A = new Matrix(5,2,mod);
        System.out.println("A (Random):\n"+A.toString());

        int[][] values1 = {{1,3,1,1},{3,2,4,2},{1,0,1,0}};
        Matrix B = new Matrix(4,3,mod,values1);
        System.out.println("B :\n"+B.toString());

        int[][] values2 = {{1,4,2,3,2},{0,1,0,4,2},{0,0,2,0,2}};
        Matrix C = new Matrix(5,3,mod,values2);
        System.out.println("C :\n"+C.toString());

        Matrix D = Matrix.add(B,C);
        System.out.println("B+C :\n"+D.toString());

        Matrix E = Matrix.substract(B,C);
        System.out.println("B-C :\n"+E.toString());

        Matrix F = Matrix.multiply(B,C);
        System.out.println("B*C :\n"+F.toString());
    }
}