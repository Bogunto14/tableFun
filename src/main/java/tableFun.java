import javafx.util.Pair;

import java.util.Objects;
import java.util.TreeMap;

public class tableFun {

    private TreeMap<Double, Double> table;

    tableFun() {
        table = new TreeMap<>();
    }

    public void add(double x, double y) {
        table.put(x, y);
    }

    public void remove(double x, double y) {
        if (table.containsKey(x) && table.containsValue(y)) {
            table.remove(x, y);
        } else System.out.println("Пары не существует");
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

    public double interpolate(double x){
        if (!table.containsKey(x) && table.lowerKey(x) != null && table.higherKey(x) != null) {
        double rightX = table.higherKey(x);
        double leftX = table.lowerKey(x);
        return table.get(leftX) + (x - leftX) / (rightX - leftX) *
                (table.get(rightX) - table.get(leftX)); // Линейная интерполяция
        } else throw new IllegalArgumentException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        tableFun tableFun = (tableFun) o;
        return Objects.equals(table, tableFun.table);
    }
}
