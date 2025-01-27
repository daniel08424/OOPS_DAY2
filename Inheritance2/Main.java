package oops_concepts.Inheritance2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.showName("Toyota");
        car.engine("Toyota");
    }
}

class Car extends Engine{
    public void showName(String name){
        System.out.println("The name of the car is "+ name);
    }

    public void tyres(){
        System.out.println("Four Tyres");
    }

}

class Engine{

    public void engine(String name){
        if(name == "Toyota"){
            System.out.println("The engine is v8");
        }
        if(name == "BMW"){
            System.out.println("The engine is v12");
        }
    }
}

