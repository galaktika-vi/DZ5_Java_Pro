import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 5; // Размер матрицы

        int[][] matrix = new int[size][size];

        
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(20) - 10;
            }
        }


        System.out.println("Матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        int negativeCount = 0;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println("Количество отрицательных элементов под главной диагональю: " + negativeCount);
    }
}
