
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;





// Пусть дан список сотрудников:
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class Task2 {
    static ArrayList<String> listPeople = new ArrayList<>();
    static HashMap<String, Integer> nameCount = new HashMap<>();
    static void nameList(){
        listPeople.add("Иван Иванов");
        listPeople.add("Светлана Петрова");
        listPeople.add("Кристина Белова");
        listPeople.add("Анна Мусина");
        listPeople.add("Анна Крутова");
        listPeople.add("Иван Юрин");
        listPeople.add("Петр Лыков");
        listPeople.add("Павел Чернов");
        listPeople.add("Петр Чернышов");
        listPeople.add("Мария Федорова");
        listPeople.add("Марина Светлова");
        listPeople.add("Мария Савина");
        listPeople.add("Мария Рыкова");
        listPeople.add("Марина Лугова");
        listPeople.add("Анна Владимирова");
        listPeople.add("Иван Мечников");
        listPeople.add("Петр Петин");
        listPeople.add("Иван Ежов");
    }
    static void nameCount()
    {
        for (int i = 0; i < listPeople.size(); i++) {
            int count = 0;
            String name = listPeople.get(i).split(" ", 2)[0];
            for (int j = 0; j < listPeople.size(); j++) {
                String name2 = listPeople.get(j).split(" ", 2)[0];
                if (name.equals(name2))
                    count++;
            }
            if (!nameCount.containsKey(name))
            nameCount.put(name, count);

        }
        System.out.println(nameCount);
    }
    
    static void replayName(){
        for (var item : nameCount.entrySet()) {
            if (item.getValue() > 1)
            System.out.println(item.getKey() + " : " + item.getValue());
        }

    }
    static void sortList()
    {
        nameCount.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
        
    }
    public static void main(String[] args) {
        nameList();
        nameCount();
        replayName();
        System.out.println();
        sortList();
    }
}
