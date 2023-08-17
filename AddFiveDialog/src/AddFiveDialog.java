import java.util.Scanner;

public class AddFiveDialog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userInput = scanner.nextInt();

        int result = addFive(userInput);

        System.out.println("Исходное число: " + userInput);
        System.out.println("Результат после добавления числа пять: " + result);

        scanner.close();
    }

    public static int addFive(int value) {
        return value + 5;
    }
}
