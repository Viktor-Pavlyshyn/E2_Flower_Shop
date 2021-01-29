package shop.bouquetimpl;

import shop.BouquetOfFlowers;

import java.util.LinkedList;
import java.util.List;

public class SummerBouquet implements BouquetOfFlowers {

    final private double PRICE = 110;
    final private String NAME_BOUQUET = "Summer Bouquet";
    private List<String> component;

    public SummerBouquet() {
        component = new LinkedList<>();
        component.add("Ribbon for packing flowers.");
        component.add("Paper for packing of a bouquet.");
        component.add("Contains 4 Tulip and 4 Daisy.");
    }

    @Override
    public double getCost() {
        return PRICE;
    }

    @Override
    public String getName() {
        return NAME_BOUQUET;
    }

    @Override
    public List<String> getComponent() {
        return component;
    }
}
