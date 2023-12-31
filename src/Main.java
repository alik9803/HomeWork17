public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Велосипед", 2);
        System.out.println(bicycle.getModelName());
        System.out.println(" колес " + bicycle.getWheelsCount());
        bicycle.updateTyre();

        System.out.println();

        Transport car = new Car("BMW", 4);
        System.out.println(car.getModelName());
        System.out.println(" колес " + car.getWheelsCount());
        car.updateTyre();
        ((Car) car).checkEngine();

        System.out.println();

        Truck truck = new Truck("Грузовая машина", 6);
        System.out.println(truck.getModelName());
        System.out.println(" колес " + truck.getWheelsCount());
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();

        System.out.println();

        ServiceStation serviceStation = new ServiceStation();
        System.out.println();
        serviceStation.check(car);
        System.out.println();
        serviceStation.check(bicycle);
        System.out.println();
        serviceStation.check(truck);
    }
}