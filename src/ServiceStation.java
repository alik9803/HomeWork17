public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        int i;
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);

            for (i = 0; i < car.wheelsCount; ++i) {
                car.updateTyre();
            }

            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);

            for (i = 0; i < truck.wheelsCount; ++i) {
                truck.updateTyre();
            }

            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);

            for (i = 0; i < bicycle.wheelsCount; ++i) {
                bicycle.updateTyre();
            }
        }

    }
}