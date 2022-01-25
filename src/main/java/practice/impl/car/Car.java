package practice.impl.car;

import practice.interfaces.Car;
import practice.interfaces.Engine;
import practice.interfaces.Tire;

public class Ford implements Car {
    private Engine engine;
    private Tire tire;

    public Ford() {
    }

    public Ford(Engine engine, Tire tire) {
        this.engine = engine;
        this.tire = tire;
    }

    public void start() {
        System.out.println("Audi starts...");
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
}
