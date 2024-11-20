package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "Golf", 2013));
        cars.add(new Car("Honda", "CRV", 2011));
        cars.add(new Car("Kia", "Rio", 2010));
        cars.add(new Car("Volkswagen", "Jetta", 2008));
        cars.add(new Car("Mercedes", "CLG", 2020));
    }
    public List<Car> getCars(int count) {
        return count >= cars.size() ? cars : cars.subList(0, count);
    }
}
