public abstract class Transport {
  private String modelName;
   private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());

        for (int i = 0; i < this.getWheelsCount(); ++i) {
            this.updateTyre();
        }
    }
}