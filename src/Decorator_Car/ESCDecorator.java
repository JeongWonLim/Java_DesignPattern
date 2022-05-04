package Decorator_Car;

public class ESCDecorator extends CarOptionDecorator{
    private int escPrice;
    public ESCDecorator(CarComponent decoratedCar, int escPrice){
        super(decoratedCar);
        this.escPrice = escPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + " + ESC";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getEscPrice();
    }

    private int getEscPrice() {
        return escPrice;
    }
}
