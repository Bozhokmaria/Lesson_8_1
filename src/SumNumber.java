import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, чтобы посчитать суму всех его чисел");
        int num = scanner.nextInt();
        System.out.println("Сумма чисел введенного числа: " + sum(num));

    }


    public static int sum(int a) {
        int result = 0;

            for (int i = 0; i <= a; i++) {
                result += i;
            }
        return result;
    }
}
