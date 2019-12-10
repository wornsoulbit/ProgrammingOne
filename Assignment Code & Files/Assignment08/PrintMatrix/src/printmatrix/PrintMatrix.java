package printmatrix;

/**
 * Prints out a matrix form based on the number of rows and columns.
 * 
 * @author Alex Vasil
 */
public class PrintMatrix {
    
    /**
     * Prints out a matrix based on the numbers inputed.
     * 
     * @param row the length of the row.
     * @param col the number of columns in the matrix.
     */
    public void printMatrix(int row, int col) {
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < col; j++) {
                System.out.print(j + i + " ");
            }
        }
    }
}
