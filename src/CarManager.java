// File: CarManager.java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CarManager {
    private List<Car> cars = new ArrayList<>();

    public CarManager() {
        // Sample data
        cars.add(new Car(1, "Toyota", "Camry", 2015, "Black", 15000, "XYZ123"));
        cars.add(new Car(2, "Toyota", "Corolla", 2012, "White", 12000, "ABC456"));
        cars.add(new Car(3, "Honda", "Civic", 2010, "Grey", 10000, "DEF789"));
    }

    // Methods to filter and save data to files
    public void saveCarsByBrand(String brand, String fileName) throws IOException {
        List<Car> filteredCars = cars.stream()
                                     .filter(car -> car.getMake().equalsIgnoreCase(brand))
                                     .collect(Collectors.toList());
        saveToFile(filteredCars, fileName);
    }

    public void saveCarsByModelAndAge(String model, int years, String fileName) throws IOException {
        int currentYear = java.time.Year.now().getValue();
        List<Car> filteredCars = cars.stream()
                                     .filter(car -> car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYearOfManufacture() > years))
                                     .collect(Collectors.toList());
        saveToFile(filteredCars, fileName);
    }

    public void saveCarsByYearAndPrice(int year, double minPrice, String fileName) throws IOException {
        List<Car> filteredCars = cars.stream()
                                     .filter(car -> car.getYearOfManufacture() == year && car.getPrice() > minPrice)
                                     .collect(Collectors.toList());
        saveToFile(filteredCars, fileName);
    }

    private void saveToFile(List<Car> cars, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (Car car : cars) {
            writer.write(car.toString() + "\n");
        }
        writer.close();
    }
}
