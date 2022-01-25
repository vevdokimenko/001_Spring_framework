package practice.impl.car;

import practice.interfaces.Engine;
import practice.interfaces.Tire;

public class Car implements practice.interfaces.Car {
    private Engine engine;
    private Tire tire;
    private String name;

    public Car() {
    }

    public Car(Engine engine, Tire tire, String name) {
        this.engine = engine;
        this.tire = tire;
        this.name = name;
    }

    public void start() {
        System.out.println(name + " starts...");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
