package Decorator;

public class main {
    public static void main(String[] args) {
        Display road = new RoadDisplay(); //기본길만 표시
        road.draw();

        Display roadWithLane = new LaneDecorator(road); //기본길 + 차선
        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(roadWithLane);
        roadWithTraffic.draw();
    }
}
