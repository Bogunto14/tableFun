import java.util.TreeMap;

public class tableFun {


    private TreeMap<Double, Double> table;

    tableFun() {
        table = new TreeMap<Double, Double>();
    }

    public boolean add(double x, double y) {
        int currentSize = table.size();
        if (!(table.containsKey(x) && table.containsValue(y))) {
            table.put(x,y);
        }
        return table.size() - currentSize == 1;


    }


    public boolean remove(double x, double y) {
        int currentSize = table.size();
        if (table.containsKey(x) && table.containsValue(y)){
        table.remove(x,y);
        } else System.out.println("Пары не существует");
        return currentSize - table.size() == 1;
    }

    public TreeMap<Double, Double> getTable() {
        return table;
    }



}
