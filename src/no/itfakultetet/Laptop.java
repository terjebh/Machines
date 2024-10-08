package no.itfakultetet;

import java.util.Objects;

public class Laptop extends Machine {

private String processor;
private Integer memory;
private String batteryType;
private Integer screenSize;

    public Laptop() {
        super();
    }

    public Laptop(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Laptop(String brand, Integer price, Integer screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", memory=" + memory +
                ", batteryType='" + batteryType + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(processor, laptop.processor) && Objects.equals(memory, laptop.memory) && Objects.equals(batteryType, laptop.batteryType) && Objects.equals(screenSize, laptop.screenSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processor, memory, batteryType, screenSize);
    }
}



