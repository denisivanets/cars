package ru.omgtu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.omgtu.domain.Car;
import ru.omgtu.services.CarService;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(final CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars", produces = "application/json")
    public List<Car> getAllCars() {
        System.out.println("CARS");
        return carService.getAll();
    }

    @GetMapping(value = "/newcar")
    public void addNewCar(
            @RequestParam(name = "mod") String model,
            @RequestParam(name = "col") String color,
            @RequestParam(name = "year") String year,
            @RequestParam(name = "cond") String cond,
            @RequestParam(name = "count") String country
    ) {
        Car car = new Car();
        car.setColor(color);
        car.setModel(model);
        car.setCreatedYear(year);
        car.setConditioner(cond);
        car.setCountry(country);
        carService.addCar(car);
    }
}
