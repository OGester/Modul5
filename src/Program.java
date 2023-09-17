public class Program {
    public static void main(String[] args) {
        Car car = new Car("volvo", 5, 123456);

        car.switchOn();
        car.dashboard();
        car.accelerate();
        car.dashboard();
        System.out.println("Speed is: " + car.getSpeed());
        car.setColor("Red");
        System.out.println("The car is " + car.getColor());
    }
}
