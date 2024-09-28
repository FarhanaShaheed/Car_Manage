
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
    	cars.add(new Car(1, "Volkswagen", "polo", 2013, "Black", 17000, "XYK123"));
        cars.add(new Car(2, "Renault", "Austral", 2012, "Red", 16000, "TBC456"));
        cars.add(new Car(3, "Mazda", "CX-5", 2010, "Grey", 10000, "DEG489"));
        cars.add(new Car(4, "Mazda", "CX-2", 2020, "Black", 15000, "XYZ123"));
        cars.add(new Car(5, "BMW", "Mini", 2012, "White", 12000, "ABC456"));
        cars.add(new Car(6, "BMW", "Rolls_Royce", 2010, "Grey", 10000, "DEF789"));
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
