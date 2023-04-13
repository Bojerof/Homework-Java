import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
/**
 * Task1
 */
public class Task1 {
    static Scanner in = new Scanner(System.in);
    static HashMap<String, String> phoneList = phonList();

    static HashMap<String, String> phonList() {
        HashMap<String, String> list = new HashMap<>();
        list.put("89115784398", "Макс");
        list.put("89527653298", "Петя");
        list.put("89814563827", "Петя");
        list.put("89119097532", "Андрей");
        list.put("89527164892", "Вася");
        list.put("89110938651", "Федор");
        list.put("89062958721", "Костя");
        list.put("89096543821", "Слава");
        return list;
    }

    static void addPhone() {
        System.out.print("Введите новое имя: ");
        String name = in.next();
        System.out.print("Введите номер: ");
        String number = in.nextLine();
        phoneList.put(number, name);
        System.out.println("Номер добавлен");
        openPhoneNumber();
    }

    static void findNumber() {
        System.out.print("Введите имя для поиска номера телефона: ");
        String name = in.next();
        for (Entry entry : phoneList.entrySet()) {
            if (entry.getValue().equals(name))
                System.out.println(name + " : " + entry.getKey());
        }
        openPhoneNumber();
    }

    static void removePhone() {
        System.out.print("Введите имя для удаления номера телефона: ");
        String name = in.next();
        String key = "";
        for (Entry entry : phoneList.entrySet()) {
            if (entry.getValue().equals(name))
                key = (String) entry.getKey();
        }
        phoneList.remove(key);
        openPhoneNumber();
    }

    static void printPhoneNumber() {
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value + " : " + key);
        }
        openPhoneNumber();
    }

    static void openPhoneNumber() {
        

        System.out.println("Что вы хотите сделать?");
        System.out.println("Нажмите 1, если хотите добваить номер\nНажмите 2, если хотите найти номер" +
                "\nНажмите 3, если хотите удалить номер\nНажмите 4, если хотите увидеть все номера" +
                "\nДля выхода нажмите 5:");
        char op = in.next().charAt(0);
        switch (op) {
            case '1':
                addPhone();
                break;
            case '2':
                findNumber();
                break;
            case '3':
                removePhone();
                break;
            case '4':
                printPhoneNumber();
                break;
            default:
                break;
        }

    }

    public static void main(String[] args) {
        openPhoneNumber();
        in.close();
    }
}