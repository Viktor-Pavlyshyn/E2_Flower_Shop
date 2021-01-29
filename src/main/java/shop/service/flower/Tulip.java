package shop.service.flower;

import shop.service.BouquetService;

public class Tulip extends BouquetService {
    private final double PRICE = 13;
    private final String COMPONENT = "added Tulip";

    public Tulip() {
        setAdditionalPrice(PRICE);
        setAdditionalComponent(COMPONENT);
    }
}