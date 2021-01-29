package shop.service.flower;

import shop.service.BouquetService;

public class Rose extends BouquetService {
    private final double PRICE = 25;
    private final String COMPONENT = "added Rose";

    public Rose() {
        setAdditionalPrice(PRICE);
        setAdditionalComponent(COMPONENT);
    }
}
