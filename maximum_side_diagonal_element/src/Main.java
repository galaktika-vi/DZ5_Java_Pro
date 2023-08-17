import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер квадратной матрицы: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int maxElement = matrix[0][size - 1];

        for (int i = 1; i < size; i++) {
            if (matrix[i][size - 1 - i] > maxElement) {
                maxElement = matrix[i][size - 1 - i];
            }
        }

        System.out.println("Максимальный элемент на побочной диагонали: " + maxElement);

        scanner.close();
    }
}
