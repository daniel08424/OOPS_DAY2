package oops_concepts.ClassAndObjects;

public class Example1 {
    public static void main(String[] args) {
        CarRent rent = new CarRent(12,"SUV");
        rent.getCar();
        rent.getRent();
        rent.showCar();
    }
}

class CarRent{
    int carId;
    String carType;

    float rent;

    CarRent(int carId, String carType){
        this.carId = carId;
        this.carType = carType;
    }
    public void getCar(){
        System.out.println("The carId is " + carId + ", the car Name is "+carType);
    }

    public void getRent(){
        if(carType == "small"){
            this.rent = 1000;
        }
        else if(carType == "van"){
            this.rent = 800;
        }
        else if(carType == "SUV"){
            this.rent = 2500;
        }
        else{
            this.rent = 500;
        }
    }

    public void showCar(){
        System.out.println(carId + " " + carType + " " + rent);
    }

}
