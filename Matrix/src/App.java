public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] test = new int[3][3];
        Matrix mat1 = new Matrix(test);
        Matrix mat2 = new Matrix(test);

        for (int i = 0; i < 3 ; ++i){
            for (int j = 0; j < 3; ++j){
                mat1.addNumb(i, j, i + 1);
                mat2.addNumb(i, j, i + 1);
            }
        }
        mat1.printMatrix();
        System.out.println();
        mat2.addNumb(0, 0, 5);
        mat2.addNumb(2, 1, 8);
        mat2.printMatrix();
        Matrix L = mat2.addMatrix(mat1);
        Matrix K = mat2.multiplyMatrix(mat1);
        System.out.println();
        L.printMatrix();
        System.out.println();
        K.printMatrix();
    }
}
