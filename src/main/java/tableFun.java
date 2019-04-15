import javafx.util.Pair;

import java.util.TreeMap;

public class tableFun {

    private TreeMap<Double, Double> table;

    tableFun() {
        table = new TreeMap<>();
    }

    public boolean add(double x, double y) {
        int currentSize = table.size();
        if (!(table.containsKey(x) && table.containsValue(y))) {
            table.put(x, y);
        }
        return table.size() - currentSize == 1;
    }

    public boolean remove(double x, double y) {
        int currentSize = table.size();
        if (table.containsKey(x) && table.containsValue(y)) {
            table.remove(x, y);
        } else System.out.println("Пары не существует");
        return currentSize - table.size() == 1;
    }

    public TreeMap<Double, Double> getTable() {
        return table;
    }

    public Pair nearestValueX(double x) {
        if (table.floorKey(x) != null && table.ceilingKey(x) != null) {
            double biggerKey = table.floorKey(x);
            double smallerKey = table.ceilingKey(x);
            double difference1 = Math.abs(biggerKey - x);
            double difference2 = Math.abs(smallerKey - x);
            if (difference1 >= difference2) return new Pair<>(smallerKey, table.get(smallerKey));
            else return new Pair<>(biggerKey, table.get(biggerKey));
        } else throw new IllegalArgumentException();
    }
}
