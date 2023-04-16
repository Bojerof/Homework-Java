import java.util.ArrayList;

public class Laptop {
    private String name;
    private int ozu;
    private String colore;
    private int memory;
    private String operationSystem;
    public Laptop(String name, int ozu, int memory, String operationSystem, String colore)
    {
        this.name = name;
        this.ozu = ozu;
        this.memory = memory;
        this.operationSystem = operationSystem;
        this.colore = colore;
    }
    public String getColore(){
        return colore;
    }
    public int getOzu(){
        return ozu;
    }
    public int getMemory(){
        return memory;
    }
    public String getName(){
        return name;
    }
    public String getOperationSystem(){
        return operationSystem;
    }
    ArrayList<Object> listOperation = new ArrayList<>();
    public ArrayList<Object> getListOperation(){
        listOperation.add(getName());
        listOperation.add(getOzu());
        listOperation.add(getMemory());
        listOperation.add(getOperationSystem());
        listOperation.add(getColore());
        return listOperation;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Ozu: %d, Memory: %d, Operation System: %s, Colore: %s",
                name, ozu, memory, operationSystem, colore);
    }
}
