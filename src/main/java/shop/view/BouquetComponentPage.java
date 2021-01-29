package shop.view;

import shop.service.BouquetService;
import shop.service.flower.Daisy;
import shop.service.flower.Rose;
import shop.service.flower.Tulip;
import shop.service.flower.Violet;
import shop.utils.ReadEnteredValueConsole;

import java.util.List;

public class BouquetComponentPage {
    BouquetService bouquetS;
    public void setUpBouquet(BouquetService bouquet) {
        ReadEnteredValueConsole readInput = new ReadEnteredValueConsole();
        bouquetS = bouquet;
        int action;
        do {
            System.out.println("Please enter number of flower.\n" +
                    "1. Add Daisy;\n" +
                    "2. Add Rose;\n" +
                    "3. Add Tulip;\n" +
                    "4. Add Violet;\n" +
                    "0. Create bouquet and exit.");
            action = readInput.getEnteredValue();

            addComponent(action, bouquetS);

        } while (action != 0);
    }

    public void addComponent(int action, BouquetService bouquetService) {

        switch (action) {
            case 1:
                bouquetS = new Daisy().setBouquetService(bouquetService);
                break;
            case 2:
                bouquetS = new Rose().setBouquetService(bouquetService);
                break;
            case 3:
                bouquetS= new Tulip().setBouquetService(bouquetService);
                break;
            case 4:
                bouquetS= new Violet().setBouquetService(bouquetService);
                break;
            case 0:
                printResult(bouquetS);
                break;
        }
    }

    private void printResult(BouquetService bouquet) {
        List<String> components = bouquet.getComponent();

        System.out.println("Name: " + bouquet.getName() + ";\n" +
                "Price: " + bouquet.getCost() + ";\n" +
                "Component:");
        for (String component : components) {
            System.out.println(component);
        }
        System.out.println("====================");
        System.out.println("");
    }
}
