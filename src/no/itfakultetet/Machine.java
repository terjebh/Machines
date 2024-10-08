package no.itfakultetet;

import java.util.Objects;

public class Machine implements MachineInterface {
    private static int machineCount;
    private String type;
    private String brand;
    private Double weight;
    private Integer price;

    public Machine() {
        machineCount++;
    }

    public Machine(String brand, Integer price) {
        this();
        this.brand = brand;
        this.price = price;
    }

    public Machine(String type, String brand, Double weight, Integer price) {
        this();
        this.type = type;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public static int getMachineCount() {
        return machineCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public void start() {
        System.out.println("Maskin "+brand+" starter...");
    }

    @Override
    public void stop() {
        System.out.println("Maskin "+brand+" stopper...");
    }

    @Override
    public String toString() {
        return "Machine{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return Objects.equals(type, machine.type) && Objects.equals(brand, machine.brand) && Objects.equals(weight, machine.weight) && Objects.equals(price, machine.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, weight, price);
    }
}
