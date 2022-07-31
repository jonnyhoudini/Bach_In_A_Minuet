package instruments;

public abstract class Instrument {

    private String name;
    private String colour;
    private InstrumentType type;

    public Instrument(String name, String colour, InstrumentType type){
        this.name = name;
        this.colour = colour;
        this.type = type;
    }


    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }
}
