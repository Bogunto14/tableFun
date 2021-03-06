import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class tableFunTest {

    @Test
    public void remove() {
        tableFun table = new tableFun();
        table.add(4,3);
        table.add(5,4);
        table.add(6,7);
        table.add(7,8);
        table.remove(4,3);
        assertEquals("{5.0=4.0, 6.0=7.0, 7.0=8.0}", table.getTable().toString());
    }

    @Test
    public void nearestValueX() {
        tableFun table = new tableFun();
        table.add(14.33,43.0);
        table.add(12.26,41.0);
        table.add(15.14,45.0);
        table.add(16.76,46.0);
        table.add(20.11,47.0);
        assertEquals(new Pair<>(20.11,47.0), table.nearestValueX(19));
    }

    @Test
    public void interpolate(){
        tableFun table = new tableFun();
        table.add(5000.0, 228);
        table.add(6000.0, 15.5);
        table.add(7000.0, 19.2);
        table.add(9000.0, 138);
        assertEquals(16.8986, table.interpolate(6378.0), 1);
    }
}