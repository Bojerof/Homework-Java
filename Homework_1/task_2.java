// Вывести все простые числа от 1 до 1000
public class task_2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = start; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count <= 2)
                System.out.printf("%s ", i);
        }
    }
}
