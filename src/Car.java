public class Car {
    public String model;

    public int price;

    public Car (String model, int price) {
        this.model = model;
        this.price = price;
    }

    public void Start () {
        System.out.println("Car has started");
    }

    public void Stop () {
        System.out.println("Car has stopped");
    }

    public void Move () {
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
