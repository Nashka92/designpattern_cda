package org.example.tp4_flyweight;

public class VehicleType {
    private String model;
    private String brand;
    private String color;

    public VehicleType(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "VehicleType{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
