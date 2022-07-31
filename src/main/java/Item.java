import behaviours.ISell;

public class Item implements ISell {

    private String name;
    private double wholesale_price;
    private double retail_price;

    public Item(String name, double wholesale_price, double retail_price){
        this.name = name;
        this.wholesale_price = wholesale_price;
        this.retail_price = retail_price;
    }

    @Override
    public double calculateMarkup() {
        return retail_price - wholesale_price;
    }
}
