// Калькулятор

import java.util.Scanner;

public class task_3 {
    static Scanner in = new Scanner(System.in);
    static int calcul(int num1)
    {
        
        System.out.print("Введите операцию +, -, *, /, для выхода введите любой символ: ");
        char op = in.next().charAt(0);
        int summ = 0;
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            if (op == '+'){ 
                summ = num1 + num2;
                System.out.printf("Равно %d \n", summ);
                return calcul(summ);
            }
            else if (op == '-'){
                summ = num1 - num2;
                System.out.printf("Равно %d \n", summ);
                return calcul(summ);
            }
            else if (op == '*'){
                summ = num1 * num2;
                System.out.printf("Равно %d \n", summ);
                return calcul(summ);
            }
            else {
                summ = num1 / num2;
                System.out.printf("Равно %d \n " , summ);
                return calcul(summ);
            }
        }
        else{ 
            return num1;
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.print("Введите число: ");
        int num1 = in.nextInt();
        int calc = calcul(num1);
        System.out.printf("Равно %d", calc);
        in.close();
    }
}