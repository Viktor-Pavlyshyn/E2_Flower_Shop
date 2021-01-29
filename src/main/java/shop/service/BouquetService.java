package shop.service;

import shop.BouquetOfFlowers;

import java.util.List;

public class BouquetService implements BouquetOfFlowers {
    private BouquetOfFlowers bouquetOfFlowers;
    private double additionalPrice;
    private String additionalComponent;

    public BouquetService setBouquetService(BouquetOfFlowers bouquetOfFlowers) {
        this.bouquetOfFlowers = bouquetOfFlowers;
        if(additionalComponent != null){
            this.bouquetOfFlowers.getComponent().add(additionalComponent);
        }
        return this;
    }

    protected void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    protected void setAdditionalComponent(String additionalComponent) {
        this.additionalComponent = additionalComponent;
    }

    @Override
    public double getCost() {
        return bouquetOfFlowers.getCost() + additionalPrice;
    }

    @Override
    public String getName() {
        return bouquetOfFlowers.getName();
    }

    @Override
    public List<String> getComponent() {
        return bouquetOfFlowers.getComponent();
    }
}