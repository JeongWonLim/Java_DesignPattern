package Decorator_Car;

public class CarOptionDecorator extends CarComponent{
    CarComponent decoratedCar;
    public CarOptionDecorator(CarComponent carcomponent){
        this.decoratedCar = carcomponent;
    }

    @Override
    public int getPrice() {
        return decoratedCar.getPrice();
    }

    @Override
    public String getCarinfo() {
        return decoratedCar.getCarinfo();
    }
}
