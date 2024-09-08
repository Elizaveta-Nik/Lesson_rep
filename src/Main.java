import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][][] multiDimensionalArray = new int[2][2][2];

        Random random = new Random();

        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                for (int k = 0; k < multiDimensionalArray[i][j].length; k++) {
                    int num = random.nextInt(-100, 100);
                    multiDimensionalArray[i][j][k] = num;
                }
            }
        }

        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                System.out.println("Значения в ваших массивах: " + Arrays.toString(multiDimensionalArray[i][j]));
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число на которое необходимо увеличить каждый элемент массива: ");
        int numIncrease = scanner.nextInt();

        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                for (int k = 0; k < multiDimensionalArray[i][j].length; k++) {
                    multiDimensionalArray[i][j][k] += numIncrease;
                }
            }
        }


        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                System.out.println("Значения в массивах после увеличения: " + Arrays.toString(multiDimensionalArray[i][j]));
            }
            System.out.println();
        }
        scanner.close();
    }
}