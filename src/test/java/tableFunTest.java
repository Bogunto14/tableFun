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
}