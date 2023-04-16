import java.util.*;

public class Main {

    public static void main(String[] args) {
        StorageLaptop storageLaptop = new StorageLaptop();
        storageLaptop.addLaptop(new Laptop("Lenovo", 16, 256, "Windows", "Black"))
                .addLaptop(new Laptop("MacBook air 13", 8, 256, "MacOs", "White"))
                .addLaptop(new Laptop("Asus", 16, 512, "Windows", "Silver"))
                .addLaptop(new Laptop("Realme", 8, 256, "Windows", "Silver"))
                .addLaptop(new Laptop("Msi", 32, 512, "Linux", "Black"));

        storageLaptop.printLaptop();

        System.out.println("Параметры фильтрации " + storageLaptop.createMap().entrySet());
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер фильтра: ");
        int operation = in.nextInt();
        if(operation == 2 || operation == 3){
            System.out.print("Введите число для фильтрации: ");
            int number = in.nextInt();
            storageLaptop.findLaptop(number, operation);
        } else if(operation == 1 || operation == 4 || operation == 5){
            System.out.print("Введите значение для фильтрации: ");
            String string = in.next();
            storageLaptop.findLaptop(string, operation);
        }
        else System.out.println("Такого фильтра нету!");
    }
}