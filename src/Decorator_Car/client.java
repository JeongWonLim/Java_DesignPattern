package Decorator_Car;

public class client {
    public static void main(String[] args) {
        CarComponent basicCar = new BasicCar(1000);
        System.out.println(basicCar.getPrice());
        System.out.println(basicCar.getCarinfo());

        CarComponent airbagCar = new AirBagDecorator(basicCar, 500);
        System.out.println(airbagCar.getPrice());
        System.out.println(airbagCar.getCarinfo());
    }
}
