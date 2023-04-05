import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class task_2 {
    static ArrayList<Integer> createList(){
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
    static ArrayList<Integer> sortList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = createList();
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        ArrayList<Integer> newList = sortList(list);
        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }
    }
}
