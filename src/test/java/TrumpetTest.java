import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Yamaha YTR-8335 Trumpet", "Silver", InstrumentType.BRASS, "B♭", 800, 997.50);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Toot toot", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(197.50, trumpet.calculateMarkup(), 0.01);
    }


}
