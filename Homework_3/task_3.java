import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class task_3 {
    static ArrayList<Integer> createList() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(30));
        }
        in.close();
        return list;
    }

    static void maxValue(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        System.out.print("Max = " + max);
    }

    static void minValue(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }
        System.out.print("Min = " + min);
    }

    static void averageValue(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        BigDecimal result = new BigDecimal((double)sum / list.size());
        result = result.setScale(2, RoundingMode.DOWN);
        System.out.println("Average = " + result);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = createList();
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        maxValue(list);
        System.out.println();
        minValue(list);
        System.out.println();
        averageValue(list);
    }
}
