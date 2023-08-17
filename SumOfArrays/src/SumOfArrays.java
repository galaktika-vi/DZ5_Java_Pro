import java.util.Random;

public class SumOfArrays {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];


        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1[i][j] = random.nextInt(100);
                array2[i][j] = random.nextInt(100);
            }
        }


        System.out.println("Массив 1:");
        printArray(array1);
        System.out.println("Массив 2:");
        printArray(array2);


        int[][] sumArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

  
        System.out.println("Массив суммы:");
        printArray(sumArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
