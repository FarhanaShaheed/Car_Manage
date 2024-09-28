// File: Main.java

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CarManager manager = new CarManager();
        try {
            manager.saveCarsByBrand("Toyota", "cars_by_brand.txt");
            System.out.println("Toyota cars saved.");
            manager.saveCarsByModelAndAge("Civic", 5, "cars_by_modelyears.txt");
            System.out.println("Old Civics saved.");
            manager.saveCarsByYearAndPrice(2015, 12000, "cars_by_year_and_price.txt");
            System.out.println("Expensive cars saved.");
        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
        System.out.println("Operations completed.");
    }
}
