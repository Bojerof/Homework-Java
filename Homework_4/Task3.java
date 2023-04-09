// Калькулятор

import java.util.LinkedList;
import java.util.Scanner;

public class Task3{
    static LinkedList<Integer> list = new LinkedList<>();
    static Scanner in = new Scanner(System.in);
    static int calcul(int num1)
    {
        System.out.print("Введите операцию +, -, *, / \nЕсли хотите кдалить последнею операцию введите 'q' \nДля выхода введите любой символ: ");
        char op = in.next().charAt(0);
        int summ = 0;
        if(op == '+' || op == '-' || op == '*' || op == '/'){
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            switch (op) {
                case '+':
                summ = num1 + num2;
                list.add(summ);
                System.out.printf("Равно %d \n", summ);
                return calcul(summ);
                
                case '-':
                summ = num1 - num2;
                list.add(summ);
                System.out.printf("Равно %d \n", summ);
                return calcul(summ);

                case '*':
                summ = num1 * num2;
                list.add(summ);
                System.out.printf("Равно %d \n", summ);
                return calcul(summ);

                case '/':
                if (num2 != 0){
                summ = num1 / num2;
                list.add(summ);
                System.out.printf("Равно %d \n " , summ);
                return calcul(summ);
                }
                else System.out.println("На ноль не делиться!");
                
            }
            
        }
        else if (op == 'q' || op == 'Q') return calcul(list.get(list.size() - 2));
        
        return num1;
        
    }
    
    public static void main(String[] args) {
        
        System.out.print("Введите число: ");
        int num1 = in.nextInt();
        int calc = calcul(num1);
        System.out.printf("Равно %d", calc);
        in.close();
    }
}