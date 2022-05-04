package Decorator_Car;

public class AirBagDecorator extends CarOptionDecorator{
    private int airBagPrice;
    public AirBagDecorator(CarComponent carComponent, int airBagPrice){
        super(carComponent);
        this.airBagPrice = airBagPrice;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + getAirBagPrice();
    }

    public int getAirBagPrice() {
        return airBagPrice;
    }

    @Override
    public String getCarinfo() {
        return super.getCarinfo() + " + Airbag";
    }
}
