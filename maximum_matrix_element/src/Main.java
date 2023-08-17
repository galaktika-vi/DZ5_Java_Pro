import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

         
        int maxEven = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 2 == 0 && matrix[i][j] > maxEven) {
                    maxEven = matrix[i][j];
                }
            }
        }

        if (maxEven != Integer.MIN_VALUE) {
            System.out.println("Максимальный четный элемент матрицы: " + maxEven);
        } else {
            System.out.println("В матрице нет четных элементов.");
        }

        scanner.close();
    }
}
