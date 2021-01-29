package shop.service.flower;

import shop.service.BouquetService;

public class Daisy extends BouquetService {
    private final double PRICE = 10;
    private final String COMPONENT = "added Daisy";

    public Daisy() {
        setAdditionalPrice(PRICE);
        setAdditionalComponent(COMPONENT);
    }
}
