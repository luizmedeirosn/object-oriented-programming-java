package fistpart.car;

import java.util.Locale;

import utils.ClearTerminal;

public class CarClient {

    public static void main(String[] args) {
        ClearTerminal.run();
        Locale.setDefault(Locale.US);
        
        Car c1 = new Car();
        System.out.println(c1);

        Car c2 = new Car("Mercedes-Benz", 2010);
        System.out.println(c2);
    }

}