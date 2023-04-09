import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
public class Task1 {

    static LinkedList<Integer> createList()
    {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter size: ");
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(30));
        }
        in.close();
        return list;
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> list)
    {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = list.size()- 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = createList();
        System.out.println(list);
        LinkedList<Integer> newList = reverseList(list);
        System.out.println(newList);
    }
}