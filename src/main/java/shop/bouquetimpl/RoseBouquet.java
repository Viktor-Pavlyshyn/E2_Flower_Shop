package shop.bouquetimpl;

import shop.BouquetOfFlowers;

import java.util.LinkedList;
import java.util.List;

public class RoseBouquet implements BouquetOfFlowers {

    final private double PRICE = 70;
    final private String NAME_BOUQUET = "Rose Bouquet";
    private List<String> component;

    public RoseBouquet() {
        component = new LinkedList<>();
        component.add("Ribbon for packing flowers.");
        component.add("Paper for packing of a bouquet.");
        component.add("Contains 4 Rose.");
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