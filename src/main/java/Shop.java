import behaviours.ISell;
import instruments.Saxophone;

import java.util.ArrayList;
import java.util.Collection;

public class Shop {

    private String name;
    private ArrayList<ISell> stockList;

    public Shop(String name) {
        this.name = name;
        this.stockList = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void addItem(ISell item) {
        this.stockList.add(item);
    }

    public ArrayList<ISell> getStock() {
        return stockList;
    }

    public void removeItem(ISell item) {
        this.stockList.remove(item);
    }

    public double calculatePotentialProfit() {
       double profit = stockList
                .stream()
                .map(ISell::calculateMarkup)
                .reduce(0.00, (a, b) -> {
                    return a + b;
                });
       return profit;
    }
}
