// File: Main.java

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the application...");
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        CarManager manager = new CarManager();
        try {
            manager.saveCarsByBrand("Toyota", "toyota_cars.txt");
            System.out.println("Toyota cars saved.");
            manager.saveCarsByModelAndAge("Civic", 5, "old_civics.txt");
            System.out.println("Old Civics saved.");
            manager.saveCarsByYearAndPrice(2015, 12000, "expensive_2015_cars.txt");
            System.out.println("Expensive 2015 cars saved.");
        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
        System.out.println("Operations completed.");
    }
}
