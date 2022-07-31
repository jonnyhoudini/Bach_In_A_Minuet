import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Saxophone saxophone;
    Item guitar_strings;

    @Before
    public void before(){
        shop = new Shop("Back in a Minuet");
        saxophone = new Saxophone("Yanagisawa A9932J alto saxophone", "Silver and Bronze", InstrumentType.WOODWIND, "E♭", 600.00, 705.80);
        guitar_strings = new Item("Spanish Guitar Strings", 4.50, 7.00);

    }

    @Test
    public void hasName(){
        assertEquals("Back in a Minuet", shop.getName());
    }

    @Test
    public void canAddItem(){
        shop.addItem(saxophone);
        shop.addItem(guitar_strings);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveItems(){
        shop.addItem(saxophone);
        shop.addItem(guitar_strings);
        shop.removeItem(saxophone);
        assertEquals(1, shop.getStock().size());
    }
}
