public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        super.service();
        this.checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}