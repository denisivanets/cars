package ru.omgtu.services;

import ru.omgtu.domain.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);
    List<Car> getAll();
}
