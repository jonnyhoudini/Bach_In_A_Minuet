package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private String pitch;
    private double wholesale_price;
    private double retail_price;

    public Trumpet(String name, String colour, InstrumentType type, String pitch, double wholesale_price, double retail_price){
        super(name, colour, type);
        this.pitch = pitch;
        this.wholesale_price = wholesale_price;
        this.retail_price = retail_price;
    }

    public String getPitch() {
        return pitch;
    }

    public String play(){
        return "Toot toot";
    }

    @Override
    public double calculateMarkup() {
        return retail_price - wholesale_price;
    }
}
