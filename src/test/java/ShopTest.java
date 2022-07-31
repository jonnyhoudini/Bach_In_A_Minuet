import instruments.InstrumentType;
import instruments.Saxophone;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Saxophone saxophone;
    Item guitar_strings;

    Trumpet trumpet;

    Item sheet_music;

    @Before
    public void before(){
        shop = new Shop("Back in a Minuet");
        saxophone = new Saxophone("Yanagisawa A9932J alto saxophone", "Silver and Bronze", InstrumentType.WOODWIND, "E♭", 600.00, 705.80);
        guitar_strings = new Item("Spanish Guitar Strings", 4.50, 7.00);
        sheet_music = new Item("MicroJazz Exercises for Trombone", 11.90, 16.00);
        trumpet = new Trumpet("Yamaha YTR-8335 Trumpet", "Silver", InstrumentType.BRASS, "B♭", 800, 997.50);

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
    @Test
    public void canCalculateTotalProfits(){
        shop.addItem(saxophone);
        shop.addItem(guitar_strings);
        shop.addItem(trumpet);
        shop.addItem(sheet_music);
        assertEquals(309.9, shop.calculatePotentialProfit(), 0.01);
    }
}
