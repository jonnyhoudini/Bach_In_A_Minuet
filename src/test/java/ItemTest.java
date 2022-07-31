import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item guitar_strings;
    Item sheet_music;

    @Before
    public void before(){
        guitar_strings = new Item("Spanish Guitar Strings", 4.50, 7.00);
        sheet_music = new Item("MicroJazz Exercises for Trombone", 11.90, 16.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.50, guitar_strings.calculateMarkup(), 0.01);
    }
}
