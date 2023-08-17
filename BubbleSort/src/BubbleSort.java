public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {-2, 45, 0, 11, -9};
        int n = array.length;

        System.out.println("Исходный массив:");
        printArray(array);

        for (int step = 0; step < n - 1; step++) {
            System.out.println("step = " + step);

            for (int i = 0; i < n - step - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Обмен элементов
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                printArray(array);
            }
        }

        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
