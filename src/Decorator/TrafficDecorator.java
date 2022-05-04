package Decorator;

public class TrafficDecorator extends DisplayDecorator{
    public TrafficDecorator(Display decoratedDisplay){
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        addTraffic();
    }

    private void addTraffic(){
        System.out.println("\t교통량 표시");
    }
}
