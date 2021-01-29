package shop.view;

import shop.BouquetOfFlowers;
import shop.bouquetimpl.RoseBouquet;
import shop.bouquetimpl.SpringBouquet;
import shop.bouquetimpl.SummerBouquet;
import shop.service.BouquetService;
import shop.utils.ReadEnteredValueConsole;

public class ShopPage {

    public void startShopPage() {
        ReadEnteredValueConsole readInput = new ReadEnteredValueConsole();
        BouquetComponentPage bouquetWithComp = new BouquetComponentPage();
        int action;

        do {
            System.out.println("Please enter number of bouquet.\n" +
                    "1. Rose Bouquet;\n" +
                    "2. Sprint Bouquet;\n" +
                    "3. Summer Bouquet;\n" +
                    "0. Create bouquet and exit.");
            action = readInput.getEnteredValue();

            if(action !=0){
                bouquetWithComp.setUpBouquet(createBouquet(action));
            }

        } while (action != 0);
    }

    private BouquetService createBouquet(int action) {
        BouquetOfFlowers bouquetOfFlowers = null;

        switch (action) {
            case 1:
                bouquetOfFlowers = new RoseBouquet();
                break;
            case 2:
                bouquetOfFlowers = new SpringBouquet();
                break;
            case 3:
                bouquetOfFlowers = new SummerBouquet();
                break;
            case 0:
                break;
        }
        return new BouquetService().setBouquetService(bouquetOfFlowers);
    }
}
