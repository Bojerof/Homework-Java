import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число num: ");
        int num = in.nextInt();
        int summ = 0;
        for (int i = 1; i <= num; i++) {
            summ += i;
        }
        System.out.println(summ);
        in.close();
    }
}