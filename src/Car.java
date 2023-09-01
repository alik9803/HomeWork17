public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        super.service();
        this.checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}