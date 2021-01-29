package shop.utils;

import java.util.Scanner;

public class ReadEnteredValueConsole {

    public int getEnteredValue() {
        Scanner console = new Scanner(System.in);

        while (!console.hasNextInt()){
            System.out.println("You entered incorrect value. \n" +
                    "Please enter correct value: ");
            console.next();
        }
        return console.nextInt();
    }
}
