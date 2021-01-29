package shop.service.flower;

import shop.service.BouquetService;

public class Violet extends BouquetService {
    private final double PRICE = 14;
    private final String COMPONENT = "added Violet";

    public Violet() {
        setAdditionalPrice(PRICE);
        setAdditionalComponent(COMPONENT);
    }
}