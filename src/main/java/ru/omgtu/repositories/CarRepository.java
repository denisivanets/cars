package ru.omgtu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.omgtu.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
