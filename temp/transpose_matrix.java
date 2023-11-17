package temp;

public class transpose_matrix {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        //transpose matrix
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[j][i] + " ");
            }
            System.out.println();
        }
        // addition of transpose matrix
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d ", arr[i][j] + arr[j][i]);
            }
            System.out.println();
        }
        int rows = 5;

        // first loop to print all rows
        for (int i = 0; i < rows; i++) {

            // inner loop 1 to print white spaces
            for (int j = 0; j < 2 * (rows - i) - 1; j++) {
                System.out.print(" ");
            }

            // inner loop 2 to print star * character
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
