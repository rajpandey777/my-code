import java.util.Scanner;

public class MatrixSearch  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix size input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Matrix element input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Search element input
        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();

        // Searching the element
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == searchElement) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found in the matrix.");
        }

        sc.close();
    }
}
