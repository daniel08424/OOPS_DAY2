package oops_concepts.interfaceExample;

public class Car implements breaking,Engine,Music{

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void brake() {
        System.out.println("Apply Brake");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

}
