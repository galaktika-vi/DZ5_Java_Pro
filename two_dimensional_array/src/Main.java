import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();


        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();


        int[][] array = new int[rows][columns];


        int counter = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = counter;
                counter++;
            }
        }


        System.out.println("Ваш двумерный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
