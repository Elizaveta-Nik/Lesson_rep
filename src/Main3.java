import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш размер (массив больше или равен 3): ");
        Random random = new Random();
        int m = scanner.nextInt();
        int n = scanner.nextInt();


        int[][] array = new int[m][n];

        if (m < 3 || n < 3) {
            System.out.println("Некорректное значение!");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-100, 100);
            }
            System.out.println("Массив: " + Arrays.toString(array[i]));
            Arrays.sort(array[i]);
            System.out.println("Сортировка строки по возрастанию: " + Arrays.toString(array[i]));
        }

        scanner.close();
    }
}
