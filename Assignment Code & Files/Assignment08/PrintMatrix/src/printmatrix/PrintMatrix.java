package printmatrix;

/**
 *
 * @author Alex Vasil
 */
public class PrintMatrix {
    
    public void printMatrix(int row, int col) {
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < col; j++) {
                System.out.print(j + i + " ");
            }
        }
    }
}
