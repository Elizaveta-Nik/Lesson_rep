import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш размер массива от 2 до 6: ");
        Random random = new Random();
        int arrayLength = scanner.nextInt();

        int[][] array = new int[arrayLength][arrayLength];

        if (arrayLength < 2 || arrayLength > 6) {
            System.out.println("Некорректное значение!");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-100, 100);
            }
            System.out.println("Значения в ваших массивах: " + Arrays.toString(array[i]));
        }

        int diagonalMain = 0;
        int diagonalSecond = 0;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (i == j) {
                    diagonalMain += array[i][j];
                }
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if ((i + j) == (arrayLength - 1)) {
                    diagonalSecond += array[i][j];
                }
            }
        }

        System.out.println("Сложение главной диагонали " + diagonalMain);
        System.out.println("Сложение второстепенной диагонали " + diagonalSecond);
        scanner.close();
    }
}
