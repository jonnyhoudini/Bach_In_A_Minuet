import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Yanagisawa A9932J alto saxophone", "Silver and Bronze", InstrumentType.WOODWIND, "E♭", 600.00, 705.80);
    }

    @Test
    public void hasName(){
        assertEquals("Yanagisawa A9932J alto saxophone", saxophone.getName());
    }

    @Test
    public void canPlay(){
        assertEquals("Woozy woozy", saxophone.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(105.80, saxophone.calculateMarkup(), 0.1);
    }

}
