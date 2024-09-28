// File: Main.java

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CarManager manager = new CarManager();
        try {
            manager.saveCarsByBrand("BMW", "cars_by_brand.txt");
            System.out.println("Same Brand cars saved.");
            manager.saveCarsByModelAndAge("CX-5", 10, "cars_by_modelyears.txt");
            System.out.println("Mazda CX-5 saved.");
            manager.saveCarsByYearAndPrice(2012, 12000, "cars_by_year_and_price.txt");
            System.out.println("Expensive cars saved.");
        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
        System.out.println("Operations completed.");
    }
}
