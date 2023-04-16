import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class StorageLaptop {
    private HashMap <Integer, String> choiseFind = new HashMap<>();
    private List<Laptop> listLaptop = new ArrayList<>();
    private List<Objects> listComand = new ArrayList<>();
    public HashMap<Integer, String> createMap(){
        choiseFind.put(1, "Имя");
        choiseFind.put(2, "Оперативная память");
        choiseFind.put(3, "Жесткий диск");
        choiseFind.put(4, "Операционная система");
        choiseFind.put(5, "Цвет");
        return choiseFind;
    }
    public StorageLaptop addLaptop(Laptop laptop){
        listLaptop.add(laptop);
        return this;
    }
    public List<Laptop>getList(){
        return listLaptop;
    }
    public void printLaptop(){
        for (var item:getList()) {
            System.out.println(item);
        }
    }
    public void findLaptop(Integer valueFind, int operation){
        for (int i = 0; i < getList().size(); i++) {
            if(getList().get(i).getListOperation().get(operation - 1).equals(valueFind))
                System.out.println(getList().get(i));
        }
    }
    public void findLaptop(String valueFind, int operation) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getListOperation().get(operation - 1).equals(valueFind))
                System.out.println(getList().get(i));
        }
    }
}
