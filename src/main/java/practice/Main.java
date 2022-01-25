package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice.impl.car.Car;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");

        Car ford = ctx.getBean("ford", Car.class);
        ford.start();
        System.out.println(ford.getEngine());
        System.out.println(ford.getTire());

        System.out.println("==========");

        Car mazda = ctx.getBean("mazda", Car.class);
        mazda.start();
        System.out.println(mazda.getEngine());
        System.out.println(mazda.getTire());
    }
}
