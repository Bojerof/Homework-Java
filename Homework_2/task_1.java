
// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class task_1 {
    
    
    static String stroka(String enter)
    {
        enter = enter.substring(1, enter.length()-1)
                        .replace("\"", "")
                        .replace(" ", "");
        System.out.println(enter);
        String[] str = enter.split(",");

        StringBuilder out = new StringBuilder("select * from students where ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("null")) out.append("");
            else out.append(str[i] + " ");
        }
        return out.toString();
    }
    public static void main(String[] args) {
        String enter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        
        String out = stroka(enter);
        System.out.println(out.replace(":", "="));
    }   
}
