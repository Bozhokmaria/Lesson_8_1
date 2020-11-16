import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, чтобы его перевернуть. НЕ должно содержать 0");
        int num = scanner.nextInt();
        System.out.println(reverse(num));


        }

        public static int reverse(int num){
        int reversed = 0;

        while (num != 0) {
            int a = num % 10;
            if (a==0){
                System.out.print("Число с ");
                return 0;
            }
            reversed = reversed * 10 + a;
            num /= 10;
        }
            System.out.print("Число после переворота ");
        return reversed;
        }
    }

