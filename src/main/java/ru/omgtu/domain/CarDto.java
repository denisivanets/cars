package ru.omgtu.domain;

import lombok.ToString;

@ToString
public class CarDto {
    private Long id;
    private String model;
    private String color;
    private String createdYear;
    private String conditioner;
    private String country;
}
