// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    
    static Scanner in = new Scanner(System.in);
    static LinkedList<Integer> createList()
    {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        System.out.print("Enter size: ");
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(30));
        }
        return list;
    }
    static LinkedList<Integer> enqueue(LinkedList<Integer> list)
    {   
        System.out.print("Enter number: ");
        list.add(list.size(), in.nextInt());
        return list;
    }
    static int dequene(LinkedList<Integer> list)
    {
        int num = list.removeFirst();
        return num;
    }
    static int first(LinkedList<Integer> list)
    {
        int firstNum = list.get(0);
        return firstNum;

    }
    
    public static void main(String[] args) {
        LinkedList<Integer> list = createList();
        System.out.println("CreateList: " + list);
        list = enqueue(list);
        System.out.println("Enqueue: " + list);
        int firstNum = dequene(list);
        System.out.println("FirstNum = " + firstNum);
        System.out.println("Dequeue: " + list);
        firstNum = first(list);
        System.out.println("FirstNum = " + firstNum);
        
        in.close();
    }
}
