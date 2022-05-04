package Decorator_Car;

public class SCCDecorator extends CarOptionDecorator{
    private int sccPrice;
    public SCCDecorator(CarComponent decoratedCar, int sccPrice){
        super(decoratedCar);
        this.sccPrice = sccPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + " + SCC";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getSccPrice();
    }

    private int getSccPrice() {
        return sccPrice;
    }
}
