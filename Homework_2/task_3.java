package Homework_2;
// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class task_3 {
    static String open()
    {
        List<String> list = new ArrayList<>();
        try (BufferedReader file = new BufferedReader(new FileReader("task_3.txt"))) {
            String s;
            while((s = file.readLine())!=null) list.add(s);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       String str = list.toString();
       str = str.substring(3, str.length()-3)
                .replace("]", "")
                .replace("[", "")
                .replace("\"", "")
                .replace("},,", ",")
                .replace("{", "")
                .replace(":", " ")
                .replace("фамилия", "Студент")
                .replace(",оценка", " получил")
                .replace(",предмет", " по предмету")
                .replace(", ", "\n");
       return str;
    }

    public static void main(String[] args) {
        String in = open();
        System.out.println(in);
    }
}
