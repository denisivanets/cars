package ru.omgtu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.omgtu.domain.Car;
import ru.omgtu.repositories.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final CarRepository carRepo;

    @Autowired
    public CarServiceImpl(final CarRepository carRepo) {
        this.carRepo = carRepo;
    }

    public List<Car> getAll() {
        return carRepo.findAll();
    }

    public void addCar(final Car car) {
        carRepo.saveAndFlush(car);
    }
}
