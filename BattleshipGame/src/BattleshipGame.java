import java.util.Scanner;
import java.util.Random;

public class BattleshipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер поля (минимально 5, максимально 20): ");
        int size = scanner.nextInt();

        if (size < 5 || size > 20) {
            System.out.println("Некорректный размер поля!");
            return;
        }

        char[][] board = new char[size][size];
        initializeBoard(board);

        int maxShips = size / 4;

        System.out.println("Размещение кораблей на поле...");
        placeShips(board, maxShips);

        System.out.println("Добро пожаловать в игру Морской бой!");
        printBoard(board);

        while (true) {
            System.out.print("Введите координату x: ");
            int x = scanner.nextInt();
            System.out.print("Введите координату y: ");
            int y = scanner.nextInt();

            if (x < 0 || x >= size || y < 0 || y >= size) {
                System.out.println("Некорректные координаты! Попробуйте снова.");
                continue;
            }

            if (board[x][y] == 'X') {
                System.out.println("Поздравляем! Вы потопили корабль.");
                board[x][y] = '*';
                printBoard(board);
                break;
            } else if (board[x][y] == ' ') {
                System.out.println("Промах! Попробуйте снова.");
                board[x][y] = '-';
                printBoard(board);
            } else {
                System.out.println("Вы уже стреляли по этой клетке. Попробуйте другую.");
            }
        }

        scanner.close();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void placeShips(char[][] board, int maxShips) {
        Random random = new Random();
        int shipsPlaced = 0;

        while (shipsPlaced < maxShips) {
            int x = random.nextInt(board.length);
            int y = random.nextInt(board.length);

            if (board[x][y] != 'X') {
                boolean vertical = random.nextBoolean();
                int shipLength = random.nextInt(3) + 2;  

                if (vertical && x + shipLength <= board.length) {
                    for (int i = 0; i < shipLength; i++) {
                        board[x + i][y] = 'X';
                    }
                    shipsPlaced++;
                } else if (!vertical && y + shipLength <= board.length) {
                    for (int i = 0; i < shipLength; i++) {
                        board[x][y + i] = 'X';
                    }
                    shipsPlaced++;
                }
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
