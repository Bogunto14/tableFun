import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class tableFunTest {

    @Test
    public void add() {
        tableFun table = new tableFun();
        assertTrue(table.add(2.3,4));
        assertTrue(table.add(2,7));
        System.out.println(table.getTable());
    }

    @Test
    public void remove() {
        tableFun table = new tableFun();
        table.add(4,3);
        table.add(5,4);
        table.add(6,7);
        table.add(7,8);
        assertTrue(table.remove(4,3));
        System.out.println(table.getTable());
    }

    @Test
    public void getTable() {
        tableFun table = new tableFun();
        table.add(14,43);
        table.add(12,41);
        table.add(15,45);
        table.add(16,46);
        table.add(17,47);
        System.out.println(table.getTable());
    }

    @Test
    public void nearestValueX() {
        tableFun table = new tableFun();
        table.add(14.33,43.0);
        table.add(12.26,41.0);
        table.add(15.14,45.0);
        table.add(16.76,46.0);
        table.add(20.11,47.0);
        assertEquals(new Pair<>(20.11,47.0), table.nearestValueX(19.1));
        System.out.println(table.getTable());
    }
}