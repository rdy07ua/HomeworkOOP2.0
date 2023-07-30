public class Main {
    public static void main(String[] args) {


        Car car = new Car("Car");
        Car skoda = new PassangerCar();
        Car Scania = new Truck();


        System.out.println("Type:" + car.getType());
        System.out.println("Type:" + skoda.getType());
        System.out.println("Type:" + Scania.getType());

    }
}