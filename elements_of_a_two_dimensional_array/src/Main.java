public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        int[][] array = new int[rows][columns];

        // Заполнение массива элементами по формуле a[i][j] = 7*i - 3*j
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 7 * i - 3 * j;
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
