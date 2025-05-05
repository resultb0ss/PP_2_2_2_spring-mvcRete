package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = List.of(
            new Car("Tesla", "Gray", "Model S", 2024),
            new Car("Tesla", "White", "Model M", 2025),
            new Car("Audi", "Red", "RS 8", 2020),
            new Car("Bentley", "Black", "Continental GT", 2022),
            new Car("BMW", "Gray", "525TSI", 2023)
    );

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
