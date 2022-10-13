public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix(5,5,10);
        System.out.println(A.toString());

        int[][] values = {{1,2,3},{4,5,6},{7,8,9}};
        Matrix B = new Matrix(3,3,values);
        System.out.println(B.toString());
    }
}